
import java.lang.System;
import java_cup.runtime.*;
%%  
%class Lexer
%unicode
%cup
%line   
%column   
%char

%{   
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
  
  
LineTerminator = \r|\n|\r\n

WhiteSpace     = {LineTerminator} | [ \t\f]   

IDENTIFIER = [A-Za-z_][A-Za-z_0-9]*   

%%    
   
<YYINITIAL> {
		"∧" { return symbol(sym.AND); }   
		"↔" { return symbol(sym.IFF); }   
		"∨" { return symbol(sym.OR); }   
		"⊤" { return symbol(sym.TRUTH); }   
		"⊥" { return symbol(sym.FALSITY); }   
		"=" { return symbol(sym.EQUALS); }   
		"→" { return symbol(sym.IMPLIES); }   
		"¬" { return symbol(sym.NOT); }   
		"∀" { return symbol(sym.FORALL); }   
		"∃" { return symbol(sym.THEREEXISTS); }   
		"(" { return symbol(sym.LBRACKET); }   
		")" { return symbol(sym.RBRACKET); }   
		"," { return symbol(sym.COMMA); }
    {IDENTIFIER}       { return symbol(sym.ID, new String(yytext()));}   
   
    {WhiteSpace}       { }     
    {LineTerminator}   { }

}    
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }


