import java.util.Random;

public class Task4 {
public static void main(String[] args) {
	Random rand = new Random();//рандом
	int money = rand.nextInt(100000);//рандом money
	
	int last = money%10;
	int penultimate = money/10%10;
	System.out.print("¬сего имеетс€: " + money + " ");
	if (penultimate != 1 && (last == 1 )) //если предпоследн€€ не 1, а последн€€ 1
		{System.out.println("рубль.");
		} else if(penultimate == 1 ) //если предпоследн€€ 1
	{
		System.out.println("рублей.");
	} else if (penultimate!=1 & (last != 0 && 2<=last && last<=4 )) // если предпоследн€€ не 1, а последн€€ от 2 до 4
	{
		System.out.println("рубл€.");
	} else if (penultimate!=1 & (last == 0 || 5<=last || last<=9 )) // eсли предпоследн€€ не 1, а последн€€ 0 или от 5 до 9
	{
		System.out.println("рублей.");
	}
	
	
}
}
