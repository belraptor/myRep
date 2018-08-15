package library.model;

public class Book {
	// private long id;
	private String name;
	private Author author;
	private Genre genre;
	private String isbn;

	public Book() {
		super();
	}

	public Book(String name, Author author, Genre genre, String isbn) {
		// this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	// public long getId() {
	// return id;
	// }
	//
	// public void setId(long id) {
	// this.id = id;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", genre=" + genre + ", isbn=" + isbn + "]";
	}

}
