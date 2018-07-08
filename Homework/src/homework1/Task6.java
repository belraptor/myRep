package Homework1;
import java.util.Random;

public class Task6 {
public static void main(String[] args) {
	Random rand = new Random();//рандом
	int a = 1000 + rand.nextInt(9000);//рандом
	System.out.println("Число " + a);
	//вычисляем цифры в числе
	int fourth = a%10;
	int third = a/10%10;
	int second = a/100%10;
	int first = a/1000;
	
	System.out.print("Цифры "); //задаём вопрос
	if (first == second || first == third || first == fourth || second == third || second == fourth || third == fourth)
	{
		System.out.print("не");
	}  
		System.out.println("отличаются");
		
	
	
}
}
