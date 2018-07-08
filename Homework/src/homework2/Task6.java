package homework2;
import java.util.Random;

public class Task6 {
public static void main (String [] args){
	Random rand = new Random();
	System.out.println("Наш массив:");
	int [] mas = new int [5 + rand.nextInt(5)];	
	for (int i = 0; i < mas.length; i++){
		mas[i] = 1 + rand.nextInt(10);
		System.out.print(mas[i]+ " ");
	}
	int max = mas[0];
	int min = mas[0];
	int x = 0, y = 0;
	
	for (int i = 0; i < mas.length; i++){		//find the maximum number and its position
		if (max <= mas[i]){
			max = mas[i];
			x = i;			
		}
	}
	for (int i = 0; i < mas.length; i++){		//find the minimum number and its position
		if (min >= mas[i]){
			min = mas[i];
			y = i;			
		}					
	}
	//for the case when the maximum and minimum numbers in several cells
	System.out.println("\nПозиция максимального числа " + x + " и минимального " + y);	
	int sum = 0;	
	if (x < y) {
		for (int i = x+1;i < y; i++){
		sum += mas[i];
		}		
	} else {
		for (int i = y+1 ;i < x; i++){
		sum += mas[i];
		}	
	}
	System.out.println("Сумма чисел между ними равна " + sum);
	
	}	
}

