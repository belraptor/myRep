import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random rand = new Random();//������
		int a = 1 + rand.nextInt(10);//������ a
		int b = 1 + rand.nextInt(10);//������ b	
		int r = 1 + rand.nextInt(20);//������ r

				
		String c = ((a*a)+(b*b)) < (r*r) ? "��" : "���";
		System.out.println("����� �� ��������� ������� ������������� ��������� ��������� " + a + " �� � " + b + " �� " + "��������� �������� " + r + " ��: " + c);
		
	}	
}
