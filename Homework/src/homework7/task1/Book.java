package homework7.task1;

public class Book {
	private String title;
	private String author;
	private int year;
	private String cover;
	private int number;//numberOfBookInLibrary

	public Book() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	public int number() {
		return year;
	}

	public void number(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", cover=" + cover
				+ ", number=" + number+ "]";
	}

}
