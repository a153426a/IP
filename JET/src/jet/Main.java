package jet;

import lexerAndParser.Lexer;
import lexerAndParser.parser;
import ast.LogicStatement;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Lexer l = new Lexer(System.in);
		parser p=new parser(l);
		System.out.println(l.next_token());
		System.out.println(l.next_token());
		System.out.println(l.next_token());
        //LogicStatement s = (LogicStatement) p.parse().value;
        //String ss = p.parse().toString();
		p.parse();
		

	}

}
