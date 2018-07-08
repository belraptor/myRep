package homework1;
import java.util.Random;

public class Task2 {
public static void main(String[] args) {
	Random rand = new Random();//рандом
	int a = 100 + rand.nextInt(900);//рандом
		
	System.out.println("Случайное число: " + a);
	
	//Method 1
	int x = 0;
	int n = a;
	for (; n!=0; n/=10)
		++x;
	System.out.println("Количество символов: " + x);
	
	//Method 2
		String s1 = String.valueOf(a);
		System.out.println("Digits: " + s1.length());
	
	int last = a%10;
	String b = 7 == last ? "да" : "нет" ; 
	System.out.println("Последняя цифра 7: " + b);
	
	// Чётное/нечётное
	//Метод 1	
		String c = a%2 == 0 ? "да" : "нет";
		System.out.println("Чётное: " + c);
		//Метод 2
		if (a%2 == 1) {
			System.out.print("не");
		}{}
		System.out.println("чётное");;
			
	
}
}
