package first;
import java.util.Random;

public class IsSimple {
public static void main (String [] args){
	Random rand = new Random();
	int num = 1 + rand.nextInt(100);
	boolean isSimple;
	if (num < 2) isSimple = false;
	else isSimple = true;
	
	for (int i=2; i <= num/i; i++){
		if ((num % i) == 0){
			isSimple = false;
			break;
		}
	}
	if (isSimple) System.out.println("Число " + num + " простое.");
	else System.out.println("Число " + num + " не простое.");
}
}
