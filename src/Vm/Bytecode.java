package Vm;

public class Bytecode {
	//instruction set
	public static final short IADD = 1;
	public static final short ISUB = 2;
	public static final short IMUL = 3;
	public static final short IDIV = 4;
	public static final short ILT = 5;
	public static final short IEQ = 6;
	public static final short IGT = 7;
	public static final short IGET= 8;
	public static final short ILET= 9;
	public static final short BR = 10;
	public static final short BRT = 11;
	public static final short BRF = 12;
	public static final short ICONST = 13;
	public static final short LOAD = 14;
	public static final short GLOAD = 15;
	public static final short STORE = 16;
	public static final short GSTORE = 17;
	public static final short PRINT = 18;
	public static final short POP = 19;
	public static final short CALL = 20;
	public static final short RET  = 21;
	public static final short STL  = 22;
	public static final short STADD  = 23;
	public static final short PRST  = 24;
	public static final short STGLOAD  = 25;
	public static final short STGSTORE  = 26;
	public static final short STCONVI  = 27;
	public static final short STLOAD  = 28;
	public static final short STSTORE  = 29;
	public static final short DCONST  = 30;
	public static final short DADD = 31;
	public static final short DSUB = 32;
	public static final short DMUL = 33;
	public static final short DDIV = 34;
	public static final short DLT = 35;
	public static final short DEQ = 36;
	public static final short DGT = 37;
	public static final short DGET= 38;
	public static final short DLET= 39;
	public static final short DLOAD = 40;
	public static final short DGLOAD = 41;
	public static final short DSTORE = 42;
	public static final short DGSTORE = 43;
	public static final short DPRINT = 44;
	public static final short STCONVD = 45;
	public static final short AASTORE= 46;
	public static final short AALOAD = 47;
	public static final short ASTORE= 48;
	public static final short ALOAD = 49;
	public static final short ARRAYLENGTH = 50;
	public static final short IALOAD = 51;
	public static final short IASTORE= 52;
	public static final short DALOAD = 53;
	public static final short DASTORE= 54;
	public static final short STALOAD = 55;
	public static final short STASTORE= 56;
	public static final short NEWARRAYTYPEO = 57;
	public static final short NEWARRAYTYPES = 58;
	public static final short NEWARRAYTYPEI = 59;
	public static final short NEWARRAYTYPED = 60;
	public static final short NEWOBJ = 61;
	public static final short OSTORED = 62;
	public static final short OLOAD = 63;
	public static final short OTOD = 64;
	public static final short OTOS = 65;
	public static final short OTOI = 66;
	public static final short OALOAD = 67;
	public static final short OASTORE= 68;
	public static final short OSTOREI = 69;
	public static final short OSTORES = 70;
	public static final short OSTORE = 71;
	public static final short OASTOREI= 72;
	public static final short OASTORED= 73;
	public static final short OASTORES= 74;
	public static final short DSUBI = 75;
	public static final short IADDD = 76;
	public static final short ISUBD = 77;
	public static final short IMULD = 78;
	public static final short IDIVD = 79;
	public static final short DDIVI = 80;
	public static final short HALT = 81;
	
	public static class Instruction{
		String name;
		int nOpnds = 0;
		public Instruction(String name) { this(name,0); }
		public Instruction(String name, int nOpnds) {
			this.name=name;
			this.nOpnds=nOpnds;
		}
	}
	
	public static Instruction[] instructions = new Instruction[] {
			null, //INvalid
			new Instruction("iadd"),
			new Instruction("isub"),
			new Instruction("imul"),
			new Instruction("idiv"),
			new Instruction("ilt"),
			new Instruction("ieq"),
			new Instruction("igt"),
			new Instruction("iget"),
			new Instruction("ilet"),
			new Instruction("br", 1),
			new Instruction("brt", 1),
			new Instruction("brf", 1),
			new Instruction("iconst", 1),
			new Instruction("load", 1),
			new Instruction("gload", 1),
			new Instruction("store", 1),
			new Instruction("gstore", 1),
			new Instruction("print"),
			new Instruction("pop"),
			new Instruction("call", 1), // call index of function in meta-info table
			new Instruction("ret"),
			new Instruction("stl"),
			new Instruction("stadd"),
			new Instruction("prst"),
			new Instruction("stgload", 1),
			new Instruction("stgstore", 1),
			new Instruction("stconvi"),
			new Instruction("stload", 1),
			new Instruction("ststore", 1),
			new Instruction("dconst",1),
			new Instruction("dadd"),
			new Instruction("dsub"),
			new Instruction("dmul"),
			new Instruction("ddiv"),
			new Instruction("dlt"),
			new Instruction("deq"),
			new Instruction("dgt"),
			new Instruction("dget"),
			new Instruction("dlet"),
			new Instruction("dload", 1),
			new Instruction("dgload", 1),
			new Instruction("dstore", 1),
			new Instruction("dgstore", 1),
			new Instruction("dprint"),
			new Instruction("stconvd"),
			new Instruction("aastore"),
			new Instruction("aaload"),
			new Instruction("astore", 1),
			new Instruction("aload", 1),
			new Instruction("arraylength", 1),
			new Instruction("iaload"),
			new Instruction("iastore"),
			new Instruction("daload"),
			new Instruction("dastore"),
			new Instruction("staload"),
			new Instruction("stastore"),
			new Instruction("newarrraytypeo"),
			new Instruction("newarrraytypes"),
			new Instruction("newarrraytypei"),
			new Instruction("newarrraytyped"),
			new Instruction("newobject"),
			new Instruction("ostored",1),
			new Instruction("oload",1),
			new Instruction("otod"),
			new Instruction("otos"),
			new Instruction("otoi"),
			new Instruction("oaload",1),
			new Instruction("oastore",1),
			new Instruction("ostorei",1),
			new Instruction("ostored",1),
			new Instruction("ostore",1),
			new Instruction("oastorei"),
			new Instruction("oastored"),
			new Instruction("oastores"),
			new Instruction("dsubi"),
			new Instruction("iaddd"),
			new Instruction("isubd"),
			new Instruction("imuld"),
			new Instruction("idivd"),
			new Instruction("ddivi"),
			new Instruction("halt")
	};
}