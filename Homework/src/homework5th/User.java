package homework5th;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class User {
	
	private String name;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
