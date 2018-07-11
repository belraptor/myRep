package homework2;
import java.util.Random;

public class Task6c {
public static void main (String [] args){
	Random rand = new Random();
	System.out.println("Наш массив:");
	int [] mas = new int [5 + rand.nextInt(5)];	
	
	for (int i = 0; i < mas.length; i++){
		mas[i] = 1 + rand.nextInt(10);
		System.out.print(mas[i]+ " ");
	}
	
	//int [] mas = {6,8,3,2,7,8,2,3,8};
	int [] tmpMasMax = new int [8];
	int [] tmpMasMin = new int [8];
	int max = mas[1];
	int min = mas[1];
	int x = 0, y = 0, j = 0, k = 0;
	System.out.println();
	//находим максимальное число и его позицию
	for (int i = 0; i < mas.length; i++){
		if (max <= mas[i]){
			max = mas[i];
			x = i;						
			tmpMasMax[j] = i;			
			System.out.print(tmpMasMax[j] + " ");
			j++;
		}
	}System.out.println();
	for (int i = 0; i < mas.length; i++){		
		if (min >= mas[i]){
			min = mas[i];
			y = i;			
			tmpMasMin[k] = y;
			System.out.print(tmpMasMin[k] + " ");
			k++;
		}					
	}

	//для случая когда максимальные и минимальные числа в нескольких ячейках
	
	System.out.println();
	System.out.println("Позиция максимального числа " + x + " и минимального " + y);	
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

