package homework2;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = 1 + rand.nextInt(100);
		
		int a = 3 ; //числа кратны трём
		int  res = 0;
		for (int i = 1; i<=n; i++){
			res += a*i;
		}
		System.out.println("Сумма первых " + n + " чисел кратных 3 равна: " + res);
	}
	
	
	
	
}
