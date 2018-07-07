package Homework1;
import java.util.Random;

public class Task4 {
public static void main(String[] args) {
	Random rand = new Random();//рандом
	int money = rand.nextInt(100000);//рандом money
	
	int last = money%10;
	int penultimate = money/10%10;
	System.out.print("Всего имеется: " + money + " ");
	if (penultimate != 1 && (last == 1 )) //если предпоследняя не 1, а последняя 1
		{System.out.println("рубль.");
		} else if(penultimate == 1 ) //если предпоследняя 1
	{
		System.out.println("рублей.");
	} else if (penultimate!=1 & (last != 0 && 2<=last && last<=4 )) // если предпоследняя не 1, а последняя от 2 до 4
	{
		System.out.println("рубля.");
	} else if (penultimate!=1 & (last == 0 || 5<=last || last<=9 )) // eсли предпоследняя не 1, а последняя 0 или от 5 до 9
	{
		System.out.println("рублей.");
	}
	
	
}
}
