package model;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PascalMain {

	public static void main(String[] args) {
		FileReader fr = null;
		System.out.println("dupa");
		try {
			 try {
			     fr = new FileReader("babelki.pas");
			   } catch (FileNotFoundException e) {
			       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
			       System.exit(1);
			   }
		//Writer writer = new Writer(new FileOutputStream(new File("test/wynik.txt")));
			Writer writer = new Writer();
			Parser p = new Parser(new PascalLexer(fr),writer);
			System.out.print(writer.getCode().toString());
			// Parser p = new Parser(new Scanner(new FileInputStream(new
			// File("test/test.txt"))), writer );
			// MainWindow w = new MainWindow();
			//Controller controller = new Controller();
			System.out.println("dupa");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

}
