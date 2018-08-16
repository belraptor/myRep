package homework9;

import java.sql.SQLException;

public class Runner {
	
	public static void main(String[] args) throws SQLException {
//		ConnectionUtils.loadDriver();
//		ConnectionUtils.connectToDataBase();
//		AuthorManager.getAuthorMap();
//		AuthorManager.getAuthorMap();
		AuthorManager.getAuthorMap();
		System.out.println(AuthorManager.authorMap.keySet());
		System.out.println(AuthorManager.authorMap.values());
//		System.err.println(AuthorManager.authorMap.size());
//		System.out.println(AuthorManager.getAuthorID("Antoine de Saint-Exupéry"));
		
		Book book = new Book("The Little Prince", "Antoine de Saint-Exupéry", Genre.Philosophical_novel, "1564gfd");
		System.out.println(AuthorManager.getAuthorID(book.getAuthor()) + "*****" + Genre.getGenreID(book.getGenre()));
//		BookManager.addBook(book);
//		ConnectionUtils.closeConnection();
		
		
//		BookManager.deleteBook(book);
	
	}
}
