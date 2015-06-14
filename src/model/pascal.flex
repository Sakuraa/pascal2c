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

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
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
begin           { return newSym(sym.BEGIN); }
and             { return newSym(sym.AND); }
array           { return newSym(sym.ARRAY); }
else            { return newSym(sym.ELSE); }
end             { return newSym(sym.END); }
if              { return newSym(sym.IF); }
of              { return newSym(sym.OF); }
or              { return newSym(sym.OR); }
program         { return newSym(sym.PROGRAM); }
procedure       { return newSym(sym.PROCEDURE); }
then            { return newSym(sym.THEN); }
type            { return newSym(sym.TYPE); }
var             { return newSym(sym.VAR); }
"*"             { return newSym(sym.MULTIPLY); }
"+"             { return newSym(sym.ADD); }
"-"             { return newSym(sym.MINUS); }
"/"             { return newSym(sym.DIVIDE); }
";"             { return newSym(sym.SEMICOLON); }
","             { return newSym(sym.COMMA); }
"("             { return newSym(sym.LEFT_BRACKET); }
")"             { return newSym(sym.RIGHT_BRACKET); }
"["             { return newSym(sym.LEFT_BRACKET2); }
"]"             { return newSym(sym.RIGHT_BRACKET2); }
"="             { return newSym(sym.EQUALS); }
"<"             { return newSym(sym.GREATER_THEN); }
">"             { return newSym(sym.LESS); }
"<="            { return newSym(sym.LESS_THEN_OR_EQUALS); }
">="            { return newSym(sym.GREATER_THEN_OR_EQUALS); }
"!="            { return newSym(sym.NOT_EQUALS); }
":"             { return newSym(sym.COLON); }
":="            { return newSym(sym.ASSINGMENT); }
"."             { return newSym(sym.DOT); }
{identifier}    { return newSym(sym.IDENT, yytext()); }
{integer}       { return newSym(sym.INT, new Integer(yytext())); }
{real}          { return newSym(sym.REAL, new Double(yytext())); }
{char}          { return newSym(sym.CHAR, new Character(yytext().charAt(1))); }
{comment}       { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext()); }
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); }
