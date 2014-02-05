package ast;

public class NotStatement extends UnaryOpStatement {
	
	public NotStatement(LogicStatement nestedStatement) {
		super(Symbol.NOT, nestedStatement);
	}

}
