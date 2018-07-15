package homework2nd;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
public static void main (String [] args){
	String chars = "abcdefghijklmnopqrstuvwxyz";
	Random rand = new Random();
	char sourceChar = chars.charAt(rand.nextInt(chars.length()));
	//System.out.println(sourceChar);
	Scanner in = new Scanner(System.in);
	System.out.println("Hello! Input char please");
	for (; ;){
		char inputChar = in.next().charAt(0);	
		if (sourceChar == inputChar) {
			System.out.println("Congratulations!!!");
			break;
		} else {
			if (Character.getNumericValue(sourceChar)>Character.getNumericValue(inputChar)){
				System.out.println("You're too low((( Try it again");
			} else {System.out.println("You're to high((( Try it again");
		}
	}
	}	
	in.close();
}
}
