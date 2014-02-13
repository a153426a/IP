package jet;

import java.io.FileReader;

import lexerAndParser.Lexer;
import lexerAndParser.parser;
import ast.LogicStatement;

public class Main {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("test.txt");
		
		Lexer l = new Lexer(fr);
		parser p = new parser(l);
        LogicStatement s = (LogicStatement) p.parse().value;
        //String ss = p.parse().toString();
		System.out.println(s);
		
		if (fr != null)
			fr.close();
	}

}
