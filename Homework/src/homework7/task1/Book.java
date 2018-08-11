package homework7.task1;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Book implements Runnable {
	private int number;//index of book in library
	private String title;
	private String author;
	private int year;
	private String cover;
	private boolean readingRoom;
	Random rand = new Random();
	int timeToRead = 1000 + rand.nextInt(2000);
	//constructor
	public Book(int number, String title, String author, int year, String cover, boolean readingRoom) {
		this.number=number;
		this.title=title;
		this.author=author;
		this.year=year;
		this.cover=cover;
		this.setReadingRoom(readingRoom);
	}
	public Queue<People> queuePeopleReader= new ConcurrentLinkedQueue<People>();
	@Override
	public void run(){
		
			while (!queuePeopleReader.isEmpty()){
				People people = queuePeopleReader.poll();
				try {
					readBook(timeToRead, people.getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}						
			}
		
            
}
	
	public void readBook (int timeToRead, String peopleName) throws InterruptedException{
		System.out.println(peopleName + "start reading book " + this.getTitle());
		Thread.sleep(timeToRead);
		System.out.println(peopleName + "stop reading book " + this.getTitle());
	}
	
	
	
	


	//добавляем читателя
	public void addQueuePeopleReader(People people){
		queuePeopleReader.offer(people);
	}
	
	//getters&setters
	public Queue<People> getQueuePeopleReader() {
		return queuePeopleReader;
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
