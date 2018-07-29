package homework6th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Task1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Homework\\src\\homework6th\\text.dat");
		Random rand = new Random();
		int i, r;
		double res = 0;
		for (i = 0; i < 20; i++) {
			r = rand.nextInt(10);
			fos.write(r);
			System.out.print(r + " ");
		}
		fos.close();

		FileInputStream fis = new FileInputStream("Homework\\src\\homework6th\\text.dat");
		System.out.println("\n");
		i = 0;
		while (fis.available() > 0) {
			res += fis.read();
			i++;
		}
		// System.out.println(res+" " + i);
		double averageRes = res / i;
		System.out.println("Average ariphmetic: " + averageRes);
		fis.close();

	}

}
