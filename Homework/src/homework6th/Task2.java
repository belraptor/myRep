package homework6th;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\deskt");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("Homework\\src\\homework6th\\dir.txt"));

		String[] paths = dir.list();
		for (int i = 0; i < paths.length; i++)
			dos.writeUTF(paths[i]);

		dos.close();
		System.out.println("The directory '" + dir + "' contains the followings files:");
		DataInputStream dis = new DataInputStream(new FileInputStream("Homework\\src\\homework6th\\dir.txt"));
		while (dis.available() > 0) {
			System.out.println(dis.readUTF());
		}
		dis.close();
	}
}
