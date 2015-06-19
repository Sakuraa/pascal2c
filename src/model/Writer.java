package model;

public class Writer {
	private StringBuilder code;
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
}