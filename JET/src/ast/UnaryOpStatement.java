package ast;

public abstract class UnaryOpStatement extends LogicStatement {

	protected final LogicStatement nestedStatement;

	public UnaryOpStatement(Symbol symbol, LogicStatement nestedStatement) {
		super(symbol);
		this.nestedStatement = nestedStatement;
	}
	
}
