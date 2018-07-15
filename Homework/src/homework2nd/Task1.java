package homework2nd;

import java.util.Scanner;

public class Task1 {		
public static void main(String[] args) {
	Scanner in  = new Scanner(System.in);
	System.out.println("Input anybody");
	String str = in.nextLine(); 
	in.close();
	StringBuilder summaryStr = new StringBuilder();
	int sum = 0;
	
	for (int i = 0; i < str.length(); i++){
		if (Character.isDigit(str.charAt(i))){
			sum += Character.getNumericValue(str.charAt(i));			
		}
	
		 else {
			 summaryStr.append(str.charAt(i));
		}
	
	}
	System.out.println("Sum of digits in a row: " + sum + "\nString without digits: " + summaryStr);
		
}
	
}
