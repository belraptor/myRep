package homework7.task1;

import javax.xml.parsers.ParserConfigurationException;

public class Runner {
public static void main(String[] args) throws InterruptedException {
	
	try {
		BookLibrary bookLibrary = new BookLibrary("7-1_Books.xml", "book");
		//System.out.println(bookLibrary.toString());
		bookLibrary.startLibrary();
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
