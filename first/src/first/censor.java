package first;

import java.util.Scanner;

public class censor {
	//замена по тексту
public static void main(String[] args) {
	System.out.println("Введите фразу");
	Scanner kbd = new Scanner(System.in);
	String text = kbd.nextLine();
	kbd.close();
	String text2 = text.replaceAll(",", " зпт ");
	System.out.println(text2);
}
}
