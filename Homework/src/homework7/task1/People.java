package homework7.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class People implements Runnable {
	private String name;
	private boolean readInTheReadingRoom;
	private List<Book> readyBook = new ArrayList<>();
	private List<Thread> booksReadyThreads = new ArrayList<>();
	Random rand = new Random();
	
	
	public People(String name, List<Book> readyBook) {
		this.name=name;
		this.readInTheReadingRoom=rand.nextBoolean();
		this.readyBook=readyBook;
	}
	//берём книгу
	private Book getReadyBook(){
		Book book = null;
		int indexBook = rand.nextInt(BookLibrary.bookList.size());
		int i = 0;
		for (Book bookChoise:BookLibrary.bookList){
			if (i==indexBook){
				book=bookChoise;
				break;
			} i++;
		}
		if (book != null && readyBook.contains(book)){
			readyBook.add(book);
		} else book = null;
				
	return book;
	}
	
	public void run(){
		Book book = getReadyBook();
		if (book.getQueuePeopleReader().isEmpty()){
			book.addQueuePeopleReader(this);
			Thread thread = new Thread(book);
			booksReadyThreads.add(thread);
			thread.start();
		}	else book.addQueuePeopleReader(this);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isReadInTheReadingRoom() {
		return readInTheReadingRoom;
	}
	public void setReadInTheReadingRoom(boolean readInTheReadingRoom) {
		this.readInTheReadingRoom = readInTheReadingRoom;
	}
	
}
