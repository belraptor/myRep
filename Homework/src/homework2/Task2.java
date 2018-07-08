package homework2;
import java.util.Random;

public class Task2 {
public static void main (String [] args){
	
	Random rand =new Random();
	int Number = 1 + rand.nextInt(10);

	if (Number == 2 | Number == 3 | Number == 5 | Number == 7){
		System.out.println("Число " + Number + " простое.");
	} 
	else if (Number%2 == 0 | Number%3 == 0 | Number%5 == 0 | Number%7 == 0){
		System.out.println("Число " + Number + "  не простое.");
		}
		else {
		System.out.println("Число " + Number + " простое.");
	}
	
}
}
