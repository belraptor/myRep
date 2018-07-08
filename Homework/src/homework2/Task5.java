package homework2;
import java.util.Random;

public class Task5 {
public static void main (String [] args){
	Random rand = new Random();
	int [] num = new int [5+rand.nextInt(5)];
	int i, temp;
	System.out.println("Исходный массив:");//fill and output a direct array
	for (i = 0; i < num.length; i++){
		num [i] = 1+rand.nextInt(10);
		System.out.print(num[i] + " ");
	}
	for (i = 0; i < num.length/2; i++){//invert the array
		temp = num[i];
		num[i] = num[num.length-i-1]; 
		num[num.length-i-1] = temp; 
	}
	System.out.println("\nПеревёрнутый массив:");//output a reverse array
	for (i = 0; i<num.length; i++){
		System.out.print(num[i] + " ");
	}

}
	
}
