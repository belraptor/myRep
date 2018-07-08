package homework2;
import java.util.Random;

public class Task4 {
public static void main (String [] args){
	Random rand = new Random();
	//int a = 1 + rand.nextInt(10);
	//int b = 1 + rand.nextInt(10);
	//System.out.println(a);
	int [][] num = new int [2 + rand.nextInt(3)][2 + rand.nextInt(3)];
	for (int i = 0; i < num.length; i++){
		for (int j = 0; j < num[i].length; j++){
		num[i][j] = 1 + rand.nextInt(10);
		System.out.print(num[i][j] + " ");
		}
		System.out.println();	
	}
	int max = num[0][0];
	int x = 0, y = 0;
	for (int i = 0; i < num.length; i++){
		for (int j = 0; j < num[i].length; j++){
			if (max < num[i][j]){
				max = num [i][j];
				x = i;
				y = j;
			}			
		}
	}
	System.out.println("Максимальное число в массиве: " + max);
	System.out.println("Позиция [" + x + "][" + y + "]");	
	
}
}
