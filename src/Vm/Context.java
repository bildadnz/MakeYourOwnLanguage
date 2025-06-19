package Vm;

public class Context {
	Context invokingContext;	// parent in the stack or "caller"
	FuncMetaData metadata;		// info about function we're executing
	int returnip;
	int[] locals;	            // args + locals, indexed from 0
	String[] strlocals;
	double[] dlocals;
	
	public Context(Context invokingContext, int returnip, FuncMetaData metadata) {
		this.invokingContext = invokingContext;
		this.returnip = returnip;
		this.metadata = metadata;
		locals = new int[metadata.nargs+metadata.nlocals];
		strlocals = new String[metadata.strparam+metadata.nstlocal];
		dlocals = new double[metadata.dparams+metadata.ndlocals];
	}
}
