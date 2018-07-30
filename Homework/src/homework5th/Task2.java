package homework5th;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<User> array1 = new ArrayList<>();
		ArrayList<User> array2 = new ArrayList<>();

		for (int i = 0; i < 50000; i++) {
			array1.add(new User());
			array2.add(new User());
		}

		long c = System.currentTimeMillis();
		for (User obj : array1)
			if (array2.contains(obj)) {
				System.out.println("yes");
			} // else System.out.println("Noooooooo");
		System.out.println(System.currentTimeMillis() - c);
	}
}
