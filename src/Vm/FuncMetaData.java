package Vm;

public class FuncMetaData {
	public String name;
	public int nargs;
	public int nlocals;
	public int address; // bytecode address
	public int strparam;
	public int nstlocal;
	public int dparams;
	public int ndlocals;
	
	public FuncMetaData(String name, int nargs, int nlocals, int strparam, int nstlocal, int dparams, int ndlocals, int address) {
		this.name = name;
		this.nargs = nargs;
		this.nlocals = nlocals;
		this.address = address;
		this.nstlocal = nstlocal;
		this.strparam = strparam;
		this.ndlocals = ndlocals;
		this.dparams = dparams;
	}
}
