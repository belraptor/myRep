package homework2nd;

import java.util.Scanner;

class Bankomat {
	int numberOfBills20;
	int numberOfBills50;
	int numberOfBills100;
	int bills20 = 20;
	int bills50 = 50;
	int bills100 = 100;
	int amountBills20, amountBills50, amountBills100;
	
	Bankomat(){
		numberOfBills20 = 200;
		numberOfBills50 = 100;
		numberOfBills100 = 50;
	}
	String withdrawMoney(int amountRequested) {
		String s;
		Scanner in = new Scanner(System.in);
		int choice =1;
		if (amountRequested%10!=0 | amountRequested<20 | amountRequested>20 & amountRequested<40 ){
		s = "Wrong amount, piece of meat!!!";
		} else {			
			do{
				System.out.println("How to give?");
				System.out.println("1. мелочью");
				System.out.println("2. средними");
				System.out.println("3. крупными");
				System.out.println("Выбери\n");
				//choice = 0;
				choice = in.nextInt();	
				if (choice < 1 || choice > 3){
					System.out.println("Ты что нажал? надо 1, 2 или 3!\n");
				}
			}while (choice < 1 || choice > 3);
		
			
		switch (choice){
		case 1:
			System.out.println("лови");
			break;
		case 2:
			System.out.println("лови");
			break;
		case 3:
			System.out.println("лови");
			break;
		}
		in.close();	
		s = "Keep your money *" + amountRequested +  " rubles*, piece of meat)))";}
		return s;
	}
	String moreFineMoney() {
		
		return null;
	}
	String averageMoney() {
		
		return null;
	}
	String moreBigMoney() {
	
		return null;
	}
}
