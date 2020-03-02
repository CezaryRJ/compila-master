package parser;
import java_cup.runtime.*;
%%

%class Lexer
%unicode
%cup
%line
%column
%public
%{
 StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}

Name = [A-Za-z][A-Za-z0-9_]*

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
Identifier = [:jletter:] [:jletterdigit:]*
%%
<YYINITIAL>{
        "program" {return symbol(sym.PROGRAM);}
	"begin" {return symbol(sym.BEGIN);}
	"end" {return symbol(sym.END);}
	"procedure" {return symbol(sym.PROCEDURE);}
	"var" {return symbol(sym.VAR);}
	":" {return symbol(sym.COLON);}
	";" {return symbol(sym.SEMICOLON);}
	"," {return symbol(sym.COMMA);}
	"proc" {return symbol(sym.PROC);}
	"(" {return symbol(sym.LPAR);}
	")" {return symbol(sym.RPAR);}
	"{" {return symbol(sym.LBRAC);}
	"}" {return symbol(sym.RBRAC);}
	"in" {return symbol(sym.IN);}
	"not" {return symbol(sym.NOT);}
	"new" {return symbol(sym.NEW);}
	"struct" {return symbol(sym.STRUCT);}
	"ref" {return symbol(sym.REF);}
	"deref" {return symbol(sym.DEREF);}
	"." {return symbol(sym.DOT);}
	"&&" {return symbol(sym.AND);}
	"||" {return symbol(sym.OR);}
	"<" {return symbol(sym.LESSTHAN);}
	"<=" {return symbol(sym.LESSOREQUAL);}
	">" {return symbol(sym.MORETHAN);}
	">=" {return symbol(sym.MOREOREQUAL);}
	"=" {return symbol(sym.EQUAL);}
	"<>" {return symbol(sym.UNEQUAL);}
	"+" {return symbol(sym.PLUS);}	
	"-" {return symbol(sym.MIN);}
	"*" {return symbol(sym.MUL);}
	"/" {return symbol(sym.DIV);}
	"^" {return symbol(sym.EXP);}
	"true" {return symbol(sym.TRUE);}
	"false" {return symbol(sym.FALSE);}
	"null" {return symbol(sym.NULL);}
	":=" {return symbol(sym.ASSIGN);}
	"if" {return symbol(sym.IF);}
	"fi" {return symbol(sym.FI);}
        "then" {return symbol(sym.THEN);}
	"while" {return symbol(sym.WHILE); }
	"do" {return symbol(sym.DO);}
	"od" {return symbol(sym.OD);}
 	{WhiteSpace}                    {}
	{Name} {return symbol(sym.NAME, new String(yytext()));}
}

.                           { throw new Error("Illegal character '" + yytext() + "' at line " + yyline + ", column " + yycolumn + "."); }
