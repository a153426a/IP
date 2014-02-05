package ast;

public class ImpliesStatement extends BinaryOpStatement {

	public ImpliesStatement(LogicStatement nestedStatementLeft,
			LogicStatement nestedStatementRight) {
		super(Symbol.IMPLIES, nestedStatementLeft, nestedStatementRight);
	}

	@Override
	public String toString() {
		return nestedStatementLeft + symbol.toString() + nestedStatementRight;
	}

}
