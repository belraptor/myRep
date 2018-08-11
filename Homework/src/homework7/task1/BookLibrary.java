package homework7.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BookLibrary {
	public static List<Book> bookList = new ArrayList<Book>();
	private List<People> listPeopleReader = new ArrayList<People>();
	 private List<Thread> threadsPeoplesReader = new ArrayList<>();
	Random rand = new Random();
	
	// fill library
	public BookLibrary(String pathFile, String tagName) throws ParserConfigurationException{
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse(pathFile);
			NodeList nodeList = document.getElementsByTagName(tagName);

			for (int i = 0; i < nodeList.getLength(); i++) {
				bookList.add(getBook(nodeList.item(i)));
			}
			 
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	//make book and get all value
	private static Book getBook(Node node) {
		boolean readingRoom = true;
		String author = null;
		String cover = null;
		int year = 0;
		String title = null;
		int number = 0;
		Book book = new Book(number, title, author, year, cover, readingRoom);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			book.setNumber(Integer.parseInt(getTagValue("Number", element)));
			book.setTitle(getTagValue("Title", element));
			book.setAuthor(getTagValue("Author", element));
			book.setYear(Integer.parseInt(getTagValue("Year", element)));
			book.setCover(getTagValue("Cover", element));
			book.setReadingRoom(getTagBooleanValue("ReadingRoom", element));
		}
		return book;
	}
	//get value from node
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	//get boolean value from node
	private static boolean getTagBooleanValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return Boolean.parseBoolean(node.getNodeValue());
	}

	 @Override
	 public String  toString() {
		 for (Book book : bookList) {
			 System.out.println(book.toString());
			 }
		return "\n";		  	 		
	 }
	 
	 public void startLibrary() throws InterruptedException {
		 System.out.println("library start");   
		 for (People people : listPeopleReader) {
	            // запустим поток действий читателя
	        	
	            Thread thread = new Thread(people);
	            threadsPeoplesReader.add(thread);
	            thread.start();
	}
	        int countPeople = threadsPeoplesReader.size();
	        while (countPeople>0){
	        	for (Thread thr : threadsPeoplesReader){
	        		if (thr.getState()==Thread.State.TERMINATED){
	        			countPeople--;
	        		}
	        		Thread.sleep(2000);
	        	}
	        }
	        System.out.println("library stop");

}
}
