import java.util.Random;

public class Task6 {
public static void main(String[] args) {
	Random rand = new Random();//������
	int a = 1000 + rand.nextInt(9000);//������
	System.out.println("����� " + a);
	//��������� ����� � �����
	int fourth = a%10;
	int third = a/10%10;
	int second = a/100%10;
	int first = a/1000;
	
	System.out.print("����� "); //����� ������
	if (first == second || first == third || first == fourth || second == third || second == fourth || third == fourth)
	{
		System.out.print("��");
	}  
		System.out.println("����������");
		
	
	
}
}
