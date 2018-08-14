package homework9;

public class Book {
	//private int id;
	private String name;
	private String author;
	private Genre genre;
	private String isbn;

	public Book() {
		super();
	}

	public Book(String name, String author, Genre genre, String isbn) {
		//this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
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
		return "Book [name=" + name + ", author=" + author + ", genre=" + genre + ", isbn=" + isbn
				+ "]";
	}

}
