package ast;

public class Variable extends LogicStatement {
	
	private final String name;
	
	public Variable(String name) {
		super(Symbol.VARIABLE);
		this.name = name;
	}

	@Override
	public String toString() {
		return "(" + name + ")";
	}

}
