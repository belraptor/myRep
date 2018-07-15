package homework2nd;


public class Task3 {
	public static void main(String[] args) {
	
	Circle circle = new Circle();
	System.out.println("Circle 1: " + circle);
	Circle circle2 = new Circle();
	System.out.println("Circle 2: " + circle2);
	System.out.println("Distance of  circles center is: " + circle2.distanceOfCirclesCenter(circle));
	System.out.println(circle2.cirlceTouchOnce(circle));
	circle2.moveToTheRandomCoordinate();
	System.out.println("Circle 2 after moving: " + circle2);
	System.out.println("Distance of  circles center is: " + circle2.distanceOfCirclesCenter(circle));
	System.out.println(circle2.cirlceTouchOnce(circle));
 }

	
}
 

