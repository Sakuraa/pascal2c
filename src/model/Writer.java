package model;

import java.io.ObjectInputStream.GetField;

public class Writer {
	private StringBuilder code;
	private String programName;
	public Writer() {
		// TODO Auto-generated constructor stub
		code = new StringBuilder();
	}
	public void write(String line){
		code.append(line);
	}
	public StringBuilder getCode() {
		return code;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
}