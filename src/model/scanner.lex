package model;
import java_cup.runtime.*;
import java.io.IOException;

%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class Scanner
%eofval{

return (symbol(Sym.EOF));

%eofval}


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
integer         = {digit}+
real            = {integer}\.{integer}
char            = '.'
string 			= '.*'
leftbracket3    = \{
rightbracket3   = \}
nonrightbracket = [^}]
comment_body    = {nonrightbracket}*
comment         = {leftbracket3}{comment_body}{rightbracket3}
whitespace      = [ \n\t\r]+


%%
/**
 * LEXICAL RULES:
 */
"and"          	{ return new Symbol(Sym.AND ); }
"array"         { return new Symbol(Sym.ARRAY ); }
"begin"         { return new Symbol(Sym.BEGIN ); }
"case"          { return new Symbol(Sym.CASE ); }
"char"			{ return new Symbol(Sym.CHAR ); }
"do"            { return new Symbol(Sym.DO ); }
"downto"        { return new Symbol(Sym.DOWNTO ); }
"else"          { return new Symbol(Sym.ELSE ); }
"end"           { return new Symbol(Sym.END ); }
"for"           { return new Symbol(Sym.FOR ); }
"function"      { return new Symbol(Sym.FUNCTION ); }
"integer"		{ return new Symbol(Sym.INT ); }
"if"            { return new Symbol(Sym.IF ); }
"mod"           { return new Symbol(Sym.MOD ); }
"nil"           { return new Symbol(Sym.NIL ); }
"not"           { return new Symbol(Sym.NOT ); }
"of"            { return new Symbol(Sym.OF ); }
"or"            { return new Symbol(Sym.OR ); }
"procedure"     { return new Symbol(Sym.PROCEDURE ); }
"program"       { return new Symbol(Sym.PROGRAM ); }
"real"			{ return new Symbol(Sym.REAL ); }
"repeat"        { return new Symbol(Sym.REPEAT ); }
"string"		{ return new Symbol(Sym.STRING ); }
"then"          { return new Symbol(Sym.THEN ); }
"to"            { return new Symbol(Sym.TO ); }
"until"         { return new Symbol(Sym.UNTIL ); }
"uses"			{ return new Symbol(Sym.USES ); }
"var"           { return new Symbol(Sym.VAR ); }
"while"         { return new Symbol(Sym.WHILE ); }
"read"          { return new Symbol(Sym.READ ); }
"readln"        { return new Symbol(Sym.READLN ); }
"write"         { return new Symbol(Sym.WRITE ); }
"writeln"       { return new Symbol(Sym.WRITELN ); }



"*"             { return new Symbol(Sym.MULTIPLY); }
"+"             { return new Symbol(Sym.ADD); }
"-"             { return new Symbol(Sym.MINUS); }
"/"             { return new Symbol(Sym.DIVIDE); }
";"             { return new Symbol(Sym.SEMICOLON); }
","             { return new Symbol(Sym.COMMA); }
"("             { return new Symbol(Sym.LEFTBRACKET); }
")"             { return new Symbol(Sym.RIGHTBRACKET); }
"["             { return new Symbol(Sym.LEFT_BRACKET2); }
"]"             { return new Symbol(Sym.RIGHT_BRACKET2); }
"="             { return new Symbol(Sym.EQUALS); }
"<"             { return new Symbol(Sym.GREATER); }
">"             { return new Symbol(Sym.LESS); }
"<="            { return new Symbol(Sym.LESS_OR_EQUALS); }
">="            { return new Symbol(Sym.GREATER_OR_EQUALS); }
"!="            { return new Symbol(Sym.NOT_EQUALS); }
":"             { return new Symbol(Sym.COLON); }
":="            { return new Symbol(Sym.ASSINGMENT); }
"."             { return new Symbol(Sym.DOT); }
{identifier}    { return new Symbol(Sym.IDE, yytext()); }
{integer}       { return new Symbol(Sym.INT, yytext()); }
{real}          { return new Symbol(Sym.REAL, yytext()); }
{char}          { return new Symbol(Sym.CHAR, yytext()); }
{string}          { return new Symbol(Sym.STRING, yytext()); }
{comment}       { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext()); }
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); }