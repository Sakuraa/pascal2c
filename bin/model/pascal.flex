package model;
import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class PascalLexer

%{
	
	private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
	}

	private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
	}

	public void error()
	throws IOException
	{
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}
%}


/*-*
 * PATTERN DEFINITIONS:
 */
letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
other_id_char   = [_]
identifier      = {letter}({alphanumeric}|{other_id_char})*
integer         = {digit}*
real            = {integer}\.{integer}
char            = '.'
leftbracket3      = \{
rightbracket3      = \}
nonrightbracket  = [^}]
comment_body    = {nonrightbracket}*
comment         = {leftbracket3}{comment_body}{rightbracket3}
whitespace      = [ \n\t]


%%
/**
 * LEXICAL RULES:
 */
begin           { return Symbol(Sym.BEGIN); }
and             { return Symbol(Sym.AND); }
array           { return Symbol(Sym.ARRAY); }
else            { return Symbol(Sym.ELSE); }
end             { return Symbol(Sym.END); }
if              { return Symbol(Sym.IF); }
of              { return Symbol(Sym.OF); }
or              { return Symbol(Sym.OR); }
program         { return Symbol(Sym.PROGRAM); }
procedure       { return Symbol(Sym.PROCEDURE); }
then            { return Symbol(Sym.THEN); }
type            { return Symbol(Sym.TYPE); }
var             { return Symbol(Sym.VAR); }
"*"             { return Symbol(Sym.MULTIPLY); }
"+"             { return Symbol(Sym.ADD); }
"-"             { return Symbol(Sym.MINUS); }
"/"             { return Symbol(Sym.DIVIDE); }
";"             { return Symbol(Sym.SEMICOLON); }
","             { return Symbol(Sym.COMMA); }
"("             { return Symbol(Sym.LEFTBRACKET); }
")"             { return Symbol(Sym.RIGHTBRACKET); }
"["             { return Symbol(Sym.LEFT_BRACKET2); }
"]"             { return Symbol(Sym.RIGHT_BRACKET2); }
"="             { return Symbol(Sym.EQUALS); }
"<"             { return Symbol(Sym.GREATER_THEN); }
">"             { return Symbol(Sym.LESS); }
"<="            { return Symbol(Sym.LESS_THEN_OR_EQUALS); }
">="            { return Symbol(Sym.GREATER_THEN_OR_EQUALS); }
"!="            { return Symbol(Sym.NOT_EQUALS); }
":"             { return Symbol(Sym.COLON); }
":="            { return Symbol(Sym.ASSINGMENT); }
"."             { return Symbol(Sym.DOT); }
{identifier}    { return Symbol(Sym.IDE, yytext()); }
{integer}       { return Symbol(Sym.INT, new Integer(yytext())); }
{real}          { return Symbol(Sym.REAL, new Double(yytext())); }
{char}          { return Symbol(Sym.CHAR, new Character(yytext().charAt(1))); }
{comment}       { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext()); }
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); }