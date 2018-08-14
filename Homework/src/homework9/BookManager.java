package homework9;

import java.sql.SQLException;

public class BookManager {
	public static void addBook(Book book) throws SQLException {
		ConnectionUtils.loadDriver();
		ConnectionUtils.connectToDataBase();
			
		try {
			ConnectionUtils.getConnection().createStatement().executeUpdate("INSERT INTO books (name, author, id_genre, isbn) VALUES ('" + book.getName() + "' , "
					+ AuthorManager.getAuthorID(book.getAuthor()) + ", " + Genre.getGenreID(book.getGenre()) + ", '" + book.getIsbn() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtils.closeConnection();		
		
	}

	public static void changeBook(Book book) throws SQLException {
		ConnectionUtils.loadDriver();
		ConnectionUtils.connectToDataBase();
		
		ConnectionUtils.getConnection().createStatement().executeUpdate(
				"UPDATE books SET name = '" + book.getName() + "' WHERE name = " + book.getName() + "')");
		ConnectionUtils.closeConnection();
	}

	public static void deleteBook(Book book)throws SQLException {
		ConnectionUtils.loadDriver();
		ConnectionUtils.connectToDataBase();
		ConnectionUtils.getConnection().createStatement().executeUpdate("DELETE FROM books WHERE name = " + book.getName() + "')");
		ConnectionUtils.closeConnection();
	}

}
