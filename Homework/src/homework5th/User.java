package homework5th;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class User {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	private int age;
	private static int year, month, dayOfMonth;
	private Calendar dateOfBirth = new GregorianCalendar(year, month, dayOfMonth);
	
	String chars = "abcdefghijklmnopqrstuvwxyz";
	Random rand = new Random();
	User(){
		name=Character.toString(chars.charAt(rand.nextInt(chars.length())));
		age = rand.nextInt(60);
		year = Calendar.YEAR-age;
		month = 1+rand.nextInt(11);
		dayOfMonth = 1+rand.nextInt(30);		
	}

}
