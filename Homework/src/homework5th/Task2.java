package homework5th;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<User> array1 = new ArrayList<>();
		ArrayList<User> array2 = new ArrayList<>();

		for (int i = 0; i < 5000; i++) {
			array1.add(new User());
			array2.add(new User());
		}
		int count = 0;
		long c = System.currentTimeMillis();
		for (User obj : array1)
			for (User obj2 : array2) {
				if (obj2.equals(obj)) {
					count++;
				}
			}
		System.out.println(count++);
		System.out.println(System.currentTimeMillis() - c);
		c = System.currentTimeMillis();
		 for (int i=0; i<array1.size(); i++){
		 for (int j=0; j<array2.size(); j++){
		 if (array1.get(i).equals(array2.get(j))){
		 System.out.println("yes");
		 }
		 }
		 }
			System.out.println(System.currentTimeMillis() - c);
	}
}
