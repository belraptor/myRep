import java.util.Random;

public class Task4 {
public static void main(String[] args) {
	Random rand = new Random();//������
	int money = rand.nextInt(100000);//������ money
	
	int last = money%10;
	int penultimate = money/10%10;
	System.out.print("����� �������: " + money + " ");
	if (penultimate != 1 && (last == 1 )) //���� ������������� �� 1, � ��������� 1
		{System.out.println("�����.");
		} else if(penultimate == 1 ) //���� ������������� 1
	{
		System.out.println("������.");
	} else if (penultimate!=1 & (last != 0 && 2<=last && last<=4 )) // ���� ������������� �� 1, � ��������� �� 2 �� 4
	{
		System.out.println("�����.");
	} else if (penultimate!=1 & (last == 0 || 5<=last || last<=9 )) // e��� ������������� �� 1, � ��������� 0 ��� �� 5 �� 9
	{
		System.out.println("������.");
	}
	
	
}
}
