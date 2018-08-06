package homework7.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMparser {
	public static void main(String[] args) throws ParserConfigurationException {

		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse("Homework\\src\\homework7\\task1\\Books.xml");
			Node root = document.getDocumentElement(); // Root element
			System.out.println("List of books:");
			System.out.println();
			ArrayList<Book> bookList = new ArrayList<>();
			NodeList books = root.getChildNodes();
			for (int i = 0; i < books.getLength(); i++) {
				Node book = books.item(i);
				if (book.getNodeType() != Node.TEXT_NODE) {
					NodeList bookProps = book.getChildNodes();
					for (int j = 0; j < bookProps.getLength(); j++) {
						Node bookProp = bookProps.item(j);
						if (bookProp.getNodeType() != Node.TEXT_NODE) {
							System.out.println(
									bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());
						}
					}
					System.out.println("\n");
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

	}
}
