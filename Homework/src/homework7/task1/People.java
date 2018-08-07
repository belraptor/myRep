package homework7.task1;

import java.util.Random;

public class People {
	private String name;
	private boolean readInTheReadingRoom;
	Random rand = new Random();
	public People(String name) {
		this.name=name;
		this.readInTheReadingRoom=rand.nextBoolean();
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
