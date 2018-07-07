package first;

import java.util.Random;

class Switch {
public static void main(String[] args) {
	Random rand = new Random();
	int money = rand.nextInt(20);
	System.out.print("В кошельке: " + money + " ");
	
	switch (money/10%10){
	case 1:
		System.out.println("рублей");
		break;
		default:
			switch (money%10) {
			case 1:
				System.out.println("рубль");
				break;
			case 0:
				System.out.println("рублей");
				break;
			case 2:
				System.out.println("рубля");
				break;
			case 3:
				System.out.println("рубля");
				break;
			case 4:
				System.out.println("рубля");
				break;

			default:
				System.out.println("рублей");
				break;
			}
	}
	int i = 100;
	int j = 200;
	while (++i < --j) ; 
	System.out.println(i);
}
}
