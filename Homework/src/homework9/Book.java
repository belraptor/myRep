package homework9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Book {
	private int id_book;
	private String nameOfBook;
	private int authorID;
	private String authorName;
	private int genreID;
	private String isbn;
	private static Connection connection;
	private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
	private static final String login = "root";
	private static final String pass = "root";
	HashMap<Integer, String> authorMap = new HashMap<>();

	public Book(int id_book, String nameOfBook, int authorID, int genreID, String isbn) {
		this.id_book = id_book;
		this.nameOfBook = nameOfBook;
		this.authorID = authorID;
		this.genreID = genreID;
		this.isbn = isbn;
	}

	public Book(int id_book, String nameOfBook, String authorName, int genreID, String isbn) {
		this.id_book = id_book;
		this.nameOfBook = nameOfBook;
		this.authorName = authorName;
		this.genreID = genreID;
		this.isbn = isbn;
	}

	public void addBook(Book book) {
		if (!authorMap.containsValue(authorName)) {
			authorID = authorMap.size() + 1;
			authorMap.put(authorID, authorName);
		} else {
			for (int i = 0; i < authorMap.size(); i++) {
				if (authorName == authorMap.get(i)) {
					authorID = i;
					break;
				}
			}
		}
		loadDriver();
		connectToDataBase();
		String addBookQuery = "INSERT INTO books (name, author, id_genre, isbn) VALUES ('" + nameOfBook + "' , "
				+ authorID + ", " + genreID + ", '" + isbn + "')";
		try {
			connection.createStatement().executeUpdate(addBookQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
	}

	public void changeElementInDataBase(String nameOfTableInDataBase, String name, int idElement) throws SQLException {
		loadDriver();
		connectToDataBase();
		connection.createStatement().executeUpdate(
				"UPDATE " + nameOfTableInDataBase + " SET name = '" + name + "' WHERE id_book = " + idElement);
		closeConnection();
	}

	public void deleteElementInDataBase(String nameOfTableInDataBase, int idElement) throws SQLException {
		loadDriver();
		connectToDataBase();
		connection.createStatement().executeUpdate("DELETE FROM " + nameOfTableInDataBase + " WHERE id = " + idElement);
		closeConnection();
	}

	public void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver registered");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
	}

	public void connectToDataBase() {
		connection = null;
		try {
			connection = DriverManager.getConnection(url, login, pass);
			System.out.println("Connection succeeded");
		} catch (SQLException e) {
			System.out.println("Connection failed");
		}
	}

	public void authorMap() throws SQLException {
		// loadDriver();
		// connectToDataBase();
		ResultSet rs = connection.createStatement().executeQuery("select * from authors");
		if (rs.isBeforeFirst()) {
			while (rs.next()) {
				authorMap.put(rs.getInt(1), rs.getString(2));
			}
		}
		// closeConnection();
	}

	public void closeConnection() {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (connection != null)
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
	}

	public String genre() {
		switch (genreID) {
		case 1:
			return Genre.Science_fiction.name();
		case 2:
			return Genre.Historical_drama.name();
		case 3:
			return Genre.Fantasy.name();
		}
		return null;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public int getAuthorID() {
		return authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public int getGenreID() {
		return genreID;
	}

	public void setGenreID(int genreID) {
		this.genreID = genreID;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id_book=" + id_book + ", nameOfBook=" + nameOfBook + ", authorID=" + authorID + ", genreID="
				+ genreID + " genre= " + genre() + ", isbn=" + isbn + "]";
	}

}
