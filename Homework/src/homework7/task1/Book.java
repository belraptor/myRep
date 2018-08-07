package homework7.task1;

public class Book {
	private int number;//index of book in library
	private String title;
	private String author;
	private int year;
	private String cover;
	private boolean readingRoom;
	

	public Book(int number, String title, String author, int year, String cover, boolean readingRoom) {
		this.number=number;
		this.title=title;
		this.author=author;
		this.year=year;
		this.cover=cover;
		this.setReadingRoom(readingRoom);
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
	public int getNumber() {
		return year;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isReadingRoom() {
		return readingRoom;
	}

	public void setReadingRoom(boolean readingRoom) {
		this.readingRoom = readingRoom;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", year=" + year + ", cover="
				+ cover + ", readingRoom=" + readingRoom + "]";
	}

}
