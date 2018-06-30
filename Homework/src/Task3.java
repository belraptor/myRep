import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random rand = new Random();//рандом
		int a = 1 + rand.nextInt(10);//рандом a
		int b = 1 + rand.nextInt(10);//рандом b	
		int r = 1 + rand.nextInt(20);//рандом r

				
		String c = ((a*a)+(b*b)) < (r*r) ? "да" : "нет";
		System.out.println("Можно ли полностью накрыть прямоугольное отверстие размерами " + a + " мм и " + b + " мм " + "картонкой радиусом " + r + " мм: " + c);
		
	}	
}
