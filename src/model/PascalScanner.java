package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;


public class PascalScanner {
	private String file_name;
	private ArrayList<Map.Entry<Token, String>> tokens;
	public PascalScanner(String file_name) {
		// TODO Auto-generated constructor stub
		this.file_name = file_name;
	}
	public enum Token {
		KEYWORD, BEGIN, END, PROGRAM,
		LEFTBRACKET, RIGHTBRACKET, LEFTBRACKET2, RIGHTBRACKET2,  LEFTBRACKET3, RIGHTBRACKET3, 
		ARYTMETIC, 
		OPERATOR,
		NUMBER, 
		TEXT, CHARACTER,
		SEMICOLON, COLON, COMA, DOT,
		WHITESPACE,
		FUNCTION,
		PROCEDURE,
		VARIABLE,
		COMMENT,
		ERROR,
		ASSIGNMENT,
		LESS_THEN,
		GREATER_THEN,
		LESS_THEN_OR_EQUAL,
		GREATER_THEN_OR_EQUAL
	}
	public String[] keywords = {"and","file","of","type","array","for","o","unit","asm","function",
			"packed","uses","begin","goto","procedure","var","case","if","program","while","const",
			"implementation","record","with","constructor","in","repeat","xor","destructor","inherited",
			"set","div","label","shl","do","mod","shr","downto","nil","string","else","not","then",
			"end","object","to"
			};
	public void load() throws IOException{
		tokens = new ArrayList<Map.Entry<Token, String>>();
		File file = new File(file_name);
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),Charset.forName("UTF-8")));
			int c;
			while((c = reader.read()) != -1) {
		      String buffor ="";
			  char character = (char) c;
			  switch(character){
			  case ' ':
				  tokens.add(new AbstractMap.SimpleEntry<Token, String>(Token.WHITESPACE, " "));
				  break;
			  case '\n':
				  tokens.add(new AbstractMap.SimpleEntry<Token, String>(Token.WHITESPACE, "\n"));
				  break;
			  case '\t':
				  tokens.add(new AbstractMap.SimpleEntry<Token, String>(Token.WHITESPACE, "\t"));
				  break;
			  case '\r':
				  tokens.add(new AbstractMap.SimpleEntry<Token, String>(Token.WHITESPACE, "\r"));
				  break;
			  default:
				  if(Character.isLetter(character)){
					  boolean isVariable = true;
				  while(true){
					  if(Character.isLetterOrDigit(character)){
						  buffor+=character;
						  reader.mark(1);
						  character =(char) reader.read();
					  }
					  else{
						  reader.reset();
						  break;
					  }
					  
				  }
				  for(int i=0;i<keywords.length;i++){
					  if(buffor.equals(keywords[i])){
						  tokens.add(new AbstractMap.SimpleEntry<Token, String>(Token.KEYWORD, buffor));
						  isVariable = false;
						  break;
					  }
				  }
				if(isVariable==true){
					tokens.add(new AbstractMap.SimpleEntry<Token, String>(Token.VARIABLE, buffor));
					  break;
				}
		}
				  
			  }
			  }

}
}
