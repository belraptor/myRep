package Homework1;


import java.util.Random;

public class Task5{
public static void main(String[] args){
		
	Random rand = new Random();//рандом
	int a = 1000 + rand.nextInt(9000);//рандом
	
	//Method 1
	System.out.println("Original: " + a);
	int last = a%10;
	int third = a/10%10;
	int second = a/100%10;
	int first = a/1000;
	System.out.println("Reversed: " + last+""+third+""+second+""+first);

	//Method 2
	String b = String.valueOf(a); //переводим в String
	b = new StringBuffer(b).reverse().toString(); //реверсв
	System.out.println("Reversed2: " + b + " "+b.length());
	
	
}
}
