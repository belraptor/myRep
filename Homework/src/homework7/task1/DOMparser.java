package homework7.task1;

import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;

public class DOMparser {
	public static void main(String[] args) {
		
		
		try {
			BookLibrary bookLibrary = new BookLibrary("Homework\\src\\homework7\\task1\\Books.xml", "book");
			System.out.println(bookLibrary.toString());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}