package model;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PascalMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			 try {
			     fr = new FileReader("babelki.pas");
			   } catch (FileNotFoundException e) {
			       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
			   }
			Writer writer = new Writer();
			Scanner scanner = new Scanner(fr);
			ParserCup p = new ParserCup(scanner, writer);
			p.parse();
			System.out.print(writer.getCode().toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

}
