package homework2;

import java.util.Random;

public class Task1 {
public static void main(String[] args) {
	Random rand = new Random();
	int a = 10 + rand.nextInt(5);
	//метод через for
	long res = 1;
	for (int i=1; i<=a; i++) {
		res = res*i;		
	}
	System.out.println("Факториал " + a + " равен: " + res);
	System.out.println();
	//метод через do-while
	int i = 1;
	long res2 = 1;
	do {res2 = res2 * i;
		i++;
	} while (i <= a);
	System.out.println("Факториал " + a + " равен: " + res2);
	
}
}
