package Vm;

import static Vm.Bytecode.*;

import java.util.ArrayList;
import java.util.List;

public class Vm {
	private static final int TRUE = 1;
	private static final int FALSE = 0;
	public static final int DEFAULT_STACK_SIZE = 1000;
	public static final int DEFAULT_CALL_STACK_SIZE = 1000;

	int[] code;
	int[] stack;
	int[] globals;
	
	Object[] arrayObject;
	Object[] stackObject;
	
	Object[] objects;
	Object[] objectstack;
	Object[] objectstorage;
	
	int[] lengths;
	int[] array;
	List<Object[]> obj = new ArrayList<>();
			
	String[] val;
	String[] strstack;
	String[] stglobals;
	
	double[] doub;
	double[] dstack;
	double[] dglobals;
	
	int ip;
	int sp=-1;
	int  fp;
	int stp=-1;
	int st;
	int db;
	int dp=-1;
	int ap=-1;
	int lp=-1;
	int op=-1;
	int adl;
	int os;
	
	Context ctx;// the active context
	FuncMetaData[] metadata;
	
	public boolean trace = false;
	public boolean whileloop = false;
	public Vm(int[] code,Object[] obj,String[] values, double[] doub, int nglobals, int nstglobals, int ndglobals,int nobjs, FuncMetaData[] metadata){
		this.code=code;
		globals = new int[nglobals];
		stglobals = new String[nstglobals];
		dglobals = new double[ndglobals];
		stack = new int[DEFAULT_STACK_SIZE];
		strstack=new String[50];
		stackObject = new Object[200];
		lengths=new int[50];
		array=new int[50];
		dstack=new double[1000];
		objectstack=new Object[1000];
		objectstorage=new Object[nobjs];
		this.metadata = metadata;
		this.val=values;
		this.objects=obj;
		this.doub=doub;
	}
	public void exec(int startip) {
		ip = startip;
		st=0;
		db=0;
		os=0;
		ctx = new Context(null,0,metadata[0]); // simulate a call to main()
		cpu();
	}
	public void cpu() {
		int opcode = code[ip];//fetch
		int a, b, addr, regnum, addrstr, stgo, addrd, dgo;
		String a1, a2;
		double ad, bd;
		int astore;
		int objname;
		while(opcode != HALT && ip < code.length){
			if(trace) System.err.printf("%-35s", disInstr());
			ip++;//jump to next instruction or operand
			switch(opcode){
				case IADD:
					b = stack[sp--];
					a = stack[sp--]; 
					stack[++sp] = a+b;
					break;
				case ISUB:
					b = stack[sp--];
					a = stack[sp--]; 
					stack[++sp] = a-b;
					break;
				case IMUL:
					b = stack[sp--];
					a = stack[sp--]; 
					stack[++sp] = a*b;
					break;
				case IDIV:
					b = stack[sp--];
					a = stack[sp--]; 
					stack[++sp] = a/b;
					break;
				case ILT:
					b = stack[sp--];
					a = stack[sp--]; 
					stack[++sp] = (a < b) ? TRUE : FALSE;
					break;
				case IEQ:
					b = stack[sp--];
					a = stack[sp--]; 
					stack[++sp] = (a == b) ? TRUE : FALSE;
					break;
				case IGT:
					b = stack[sp--];
					a = stack[sp--];
					stack[++sp] = (a > b) ? TRUE : FALSE;
					break;
				case IGET:
					b = stack[sp--];
					a = stack[sp--];
					stack[++sp] = (a >= b) ? TRUE : FALSE;
					break;
				case ILET:
					b = stack[sp--];
					a = stack[sp--];
					stack[++sp] = (a <= b) ? TRUE : FALSE;
					break;
				case BR:
					ip = code[ip++];
					break;
				case BRT:
					addr = code[ip++];
					if(	stack[sp--] == TRUE) ip = addr;
					break;
				case BRF:
					addr = code[ip++];
					if(	stack[sp--] == FALSE) ip = addr;
					break;
				case ICONST:
					stack[++sp] = code[ip++];
					break;
				case LOAD:
					regnum = code[ip++];
					stack[++sp] = ctx.locals[regnum];
					break;
				case GLOAD:
					addr = code[ip++];
					stack[++sp] = globals[addr];
					break;
				case STORE:
					regnum = code[ip++];
					ctx.locals[regnum] = stack[sp--];
					break;
				case GSTORE:
					addr = code[ip++];
					globals[addr] = stack[sp--];
					break;
				case PRINT:
					System.out.println(stack[sp--]);
					break;
				case STL:
					st=code[ip++];
					strstack[++stp] = val[st];
					break;
				case STADD:
					a2=strstack[stp--];
					a1=strstack[stp--];
					strstack[++stp] = a1+a2;
					break;
				case PRST:
					System.out.println(strstack[stp--]);
					break;
				case STGSTORE:
					addrstr = code[ip++];
					stglobals[addrstr] = strstack[stp--];
					break;
				case STGLOAD:
					addrstr = code[ip++];
					strstack[++stp] = stglobals[addrstr];
					break;
				case STCONVI:
					a1 = strstack[stp--];
					a = Integer.parseInt(a1);
					stack[++sp] = a;
					break;
				case STLOAD:
					stgo = code[ip++];
					strstack[++stp] =ctx.strlocals[stgo];
					break;
				case STSTORE:
					stgo = code[ip++];
					ctx.strlocals[stgo] = strstack[stp--];
					break;
				case DCONST:
					db=code[ip++];
					dstack[++dp] = doub[db];
					break;
				case DADD:
					bd = dstack[dp--];
					ad = dstack[dp--];
					dstack[++dp]=ad+bd;
					break;
				case DSUB:
					bd = dstack[dp--];
					ad = dstack[dp--];
					dstack[++dp]=ad-bd;
					break;
				case DMUL:
					bd = dstack[dp--];
					ad = dstack[dp--];
					dstack[++dp]=ad*bd;
					break;
				case DDIV:
					bd = dstack[dp--];
					ad = dstack[dp--];
					dstack[++dp]=ad/bd;
					break;
				case DLT:
					bd = dstack[dp--];
					ad = dstack[dp--]; 
					stack[++sp] = (ad < bd) ? TRUE : FALSE;
					break;
				case DEQ:
					bd = dstack[dp--];
					ad = dstack[dp--]; 
					stack[++sp] = (ad == bd) ? TRUE : FALSE;
					break;
				case DGT:
					bd = dstack[dp--];
					ad = dstack[dp--]; 
					stack[++sp] = (ad > bd) ? TRUE : FALSE;
					break;
				case DGET:
					bd = dstack[dp--];
					ad = dstack[dp--];
					stack[++sp] = (ad >= bd) ? TRUE : FALSE;
					break;
				case DLET:
					bd = dstack[dp--];
					ad = dstack[dp--];
					stack[++sp] = (ad <= bd) ? TRUE : FALSE;
					break;
				case DLOAD:
					dgo = code[ip++];
					dstack[++dp] = ctx.dlocals[dgo];
					break;
				case DGLOAD:
					addrd = code[ip++];
					dstack[++dp] = dglobals[addrd];
					break;
				case DSTORE:
					dgo = code[ip++];
					ctx.dlocals[dgo] = dstack[dp--];
					break;
				case DGSTORE:
					addrd = code[ip++];
					dglobals[addrd] = dstack[dp--];
					break;
				case DPRINT:
					System.out.println(dstack[dp--]);
					break;
				case STCONVD:
					a1=strstack[stp--];
					ad=Double.parseDouble(a1);
					dstack[++dp] = ad;
					break;
				case NEWARRAYTYPEO:
					astore = stack[sp--];
					lengths[++lp] = astore;
					arrayObject = new Object[astore];
					obj.add(arrayObject);
					break;
				case NEWARRAYTYPES:
					astore = stack[sp--];
					lengths[++lp] = astore;
					arrayObject = new String[astore];
					obj.add(arrayObject);
					break;
				case NEWARRAYTYPEI:
					astore = stack[sp--];
					lengths[++lp] = astore;
					arrayObject = new Integer[astore];
					obj.add(arrayObject);
					break;
				case NEWARRAYTYPED:
					astore = stack[sp--];
					lengths[++lp] = astore;
					arrayObject = new Double[astore];
					obj.add(arrayObject);
					break;
				case ARRAYLENGTH:
					adl=code[ip++];
					stack[++sp] = lengths[adl];
					break;
				case ASTORE:
					adl=code[ip++];
					obj.remove(adl);
					obj.add(adl,stackObject);
					break;
				case ALOAD:
					adl=code[ip++];
					stackObject=obj.get(adl);
					break;
				case AASTORE://index
					adl=array[ap--];
					stack[++sp]=adl;
					break;
				case AALOAD:
					adl=stack[sp--];
					array[++ap]=adl;
					break;
				case IASTORE:
					adl=array[ap++];
					stackObject[adl]=stack[sp--];
					break;
				case IALOAD:
					adl=array[ap++];
					stack[++sp]=(int) stackObject[adl];
					break;
				case DASTORE:
					adl=array[ap++];
					stackObject[adl]=dstack[dp--];
					break;
				case DALOAD:
					adl=array[ap++];
					dstack[++dp]=(double) stackObject[adl];
					break;
				case STASTORE:
					adl=array[ap++];
					stackObject[adl]=strstack[stp--];
					break;
				case STALOAD:
					adl=array[ap++];
					strstack[++stp]=(String) stackObject[adl];
					break;
				case NEWOBJ:
					objectstack[++op]= objects[os++];
					break;
				case OSTORED:
					objname = code[ip++];
					//System.out.println(stack[sp--]);
					objectstorage[objname]=dstack[dp--];
					break;
				case OSTOREI:
					objname = code[ip++];
					//System.out.println(stack[sp--]);
					objectstorage[objname]=stack[sp--];
					break;
				case OSTORES:
					objname = code[ip++];
					//System.out.println(stack[sp--]);
					objectstorage[objname]=strstack[stp--];
					break;
				case OSTORE:
					objname = code[ip++];
					//System.out.println(stack[sp--]);
					objectstorage[objname]=objectstack[op--];
					break;
				case OLOAD:
					objname = code[ip++];
					objectstack[++op]=objectstorage[objname];
					break;
				case OTOD:
					ad=(double) objectstack[op--];
					dstack[++dp] = ad;
					break;
				case OTOS:
					a1=(String) objectstack[op--];
					strstack[++stp] = a1;
					break;
				case OTOI:
					a=(int) objectstack[op--];
					stack[++sp] = a;
					break;
				case OASTORE:
					adl=array[ap++];
					stackObject[adl]=objectstack[op--];
					break;
				case OASTOREI:
					adl=array[ap++];
					stackObject[adl]=stack[sp--];
					break;
				case OASTORED:
					adl=array[ap++];
					stackObject[adl]=dstack[dp--];
					break;
				case OASTORES:
					adl=array[ap++];
					stackObject[adl]=strstack[stp--];
					break;
				case OALOAD:
					adl=array[ap++];
					objectstack[++op]=stackObject[adl];
					break;
				case IADDD:
					b = stack[sp--];
					ad = dstack[dp--];
					dstack[++dp] = ad+b;
					stack[++sp] = (int) (ad+b);
					break;
				case ISUBD:
					b = stack[sp--];
					ad = dstack[dp--];
					dstack[++dp] = b-ad;
					stack[++sp] = (int) (b-ad);
					break;
				case DSUBI:
					b = stack[sp--];
					ad = dstack[dp--];
					dstack[++dp] = ad-b;
					stack[++sp] = (int) (ad-b);
					break;
				case IMULD:
					b = stack[sp--];
					ad = dstack[dp--];
					dstack[++dp] = ad*b;
					stack[++sp] = (int) (ad*b);
					break;
				case IDIVD:
					b = stack[sp--];
					ad = dstack[dp--];
					dstack[++dp] = b/ad;
					stack[++sp] = (int) (b/ad);
					break;
				case DDIVI:
					b = stack[sp--];
					ad = dstack[dp--];
					dstack[++dp] = ad/b;
					stack[++sp] = (int) (ad/b);
					break;
				case POP:
					--sp;
					break;
				case CALL :
					// expects all args on stack
					int findex = code[ip++];// index of target function
					int nargs = metadata[findex].nargs;// how many args got pushed
					int nstargs=metadata[findex].strparam;
					int ndargs = metadata[findex].dparams;
					ctx = new Context(ctx,ip,metadata[findex]);
					// copy args into new context
					int firstarg = sp-nargs+1;
					int stparam1 = stp-nstargs+1;
					int dargs1 = dp-ndargs+1;
					for (int i=0; i<nargs; i++) {
						ctx.locals[i] = stack[firstarg+i];
					}
					for (int i=0; i<nstargs; i++) {
						ctx.strlocals[i] = strstack[stparam1+i];
					}
					for (int i=0; i<ndargs; i++) {
						ctx.dlocals[i] = dstack[dargs1+i];
					}
					sp -= nargs;
					stp -=nstargs;
					dp -= ndargs;
					ip = metadata[findex].address;// jump to function
					break;
				case RET:
					ip = ctx.returnip;
					ctx = ctx.invokingContext;			// pop
					break;
				default :
					throw new Error("invalid opcode: "+opcode+" at ip="+(ip-1));
			}
			if(trace) System.err.println(stackString());
			opcode = code[ip];
		}
		if(trace) System.err.printf("%-35s", disInstr());
		if(trace) System.err.println(stackString());
		if(trace) dumpDataMemory();
	}
	protected String stackString(){
		StringBuilder buf = new StringBuilder();
		buf.append("stack=[");
		for(int i = 0; i <= sp; i++){
			int o = stack[i];
			buf.append("  ");
			buf.append(o);
		}
		for(int i = 0; i <= stp; i++){
			String o = strstack[i];
			buf.append("  ");
			buf.append(o);
		}
		for(int i = 0; i <= dp; i++){
			double o = dstack[i];
			buf.append("  ");
			buf.append(o);
		}
		for(int i = 0; i <= op; i++){
			Object o = objectstack[i];
			buf.append("  ");
			buf.append(o);
		}
		buf.append(" ]");
		return buf.toString();
	}
	
	protected String callStackString() {
		List<String> stack = new ArrayList<String>();
		Context c = ctx;
		while ( c!=null ) {
			if ( c.metadata!=null ) {
				stack.add(0, c.metadata.name);
			}
			c = c.invokingContext;
		}
		return "calls="+stack.toString();
	}
	protected String disInstr() {
		int opcode = code[ip];
		String opName = Bytecode.instructions[opcode].name;
		StringBuilder buf = new StringBuilder();
		buf.append(String.format("%04d:\t%-11s",ip, opName));
		int nopnds = Bytecode.instructions[opcode].nOpnds;
		if(nopnds > 0){
			List<String> operands = new ArrayList<>();		
			for(int i = ip+1; i <=ip+nopnds; i++){
				operands.add(String.valueOf(code[i]));
			}
			for(int i =0; i < operands.size(); i++){
				String s = operands.get(i);
				if (i > 0) buf.append(", ");
				buf.append(s);
			}
		}
		return buf.toString();
	} 
	protected void dumpDataMemory() {
		System.err.println("Data Memory:");
		int addr = 0;
		for(int o : globals){
			System.err.printf("%04d: %s\n", addr, o);
			addr++;
		}
		System.err.println();
	}
	protected void dumpCodeMemory() {
		System.err.println("Code Memory:");
		int addr = 0;
		for(int o : code){
			System.err.printf("%04d: %s\n", addr, o);
			addr++;
		}
		System.err.println();
	}
}
