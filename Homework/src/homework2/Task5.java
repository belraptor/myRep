package homework2;
import java.util.Random;

public class Task5 {
public static void main (String [] args){
	Random rand = new Random();
	int [] num = new int [5+rand.nextInt(5)];
	System.out.println("Исходный массив:");//заполняем и выводим прямой массив
	for (int i = 0; i < num.length; i++){
		num [i] = 1+rand.nextInt(10);
		System.out.print(num[i] + " ");
	}
	System.out.println();
	System.out.println("Перевёрнутый массив:");//выводим обратный массив
	for (int i = num.length-1; 0 <= i; i--){
		System.out.print(num[i] + " ");
	}
}
	
}
