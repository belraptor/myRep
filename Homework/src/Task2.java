import java.util.Random;

public class Task2 {
public static void main(String[] args) {
	Random rand = new Random();//������
	int a = 100 + rand.nextInt(900);//������
		
	System.out.println("��������� �����: " + a);
	
	//Method 1
	int x = 0;
	int n = a;
	for (; n!=0; n/=10)
		++x;
	System.out.println("���������� ��������: " + x);
	
	//Method 2
		String s1 = String.valueOf(a);
		System.out.println("Digits: " + s1.length());
	
	int last = a%10;
	String b = 7 == last ? "��" : "���" ; 
	System.out.println("��������� ����� 7: " + b);
	
	// ׸����/��������
	//����� 1	
	String c = a%2 == 0 ? "��" : "���";
	System.out.println("׸����: " + c);
	//����� 2
	if (a%2 == 1) {
		System.out.print("��");
	}{}
	System.out.println("������");
			
	
}
}
