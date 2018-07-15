package homework2nd;

class Bankomat {
	int numberOfBills20 = 200;
	int numberOfBills50 = 100;
	int numberOfBills100 = 50;
	
	Bankomat(){
		numberOfBills20 = 200;
		numberOfBills50 = 100;
		numberOfBills100 = 50;
	}
	String withdrawMoney(int count){
		String s;
		if (count%10!=0 | count<20 | count>20 & count<40 ){
		s = "Wrong amount, piece of meat!!!";
		} else s = "Keep your money *" + count +  " rubles*, piece of meat)))";
		return s;
	}
}
