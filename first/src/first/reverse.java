package first;

import java.util.Random;

public class reverse {
public static void main(String[] args) {
	//int a = 726;
	
	
	Random rand = new Random();//рандом
	int a = 100 + rand.nextInt(9000000);//рандом
	
	
	System.out.println(a);
	int last = a%10;
	int second = ((a-last)/10)%10;
	int first = a/100;
	System.out.println(last+""+second+""+first);
	System.out.println("Метод тот же:"+a%10+""+a/10%10+""+a/100);
	
	
	String b = String.valueOf(a);
	b = new StringBuffer(b).reverse().toString();
	System.out.println(b+" "+b.length());
	
	
}
}
