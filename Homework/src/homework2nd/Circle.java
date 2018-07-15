package homework2nd;
import static java.lang.Math.PI;
import java.util.Random;
import java.util.Scanner;

class Circle {
	 public double r=1;
	 public int x,y;
	private Scanner inR;
	private Scanner inX;
	private Scanner inY; 
	 
	// Scanner inx = new Scanner(System.in);
	// Scanner iny = new Scanner(System.in);
	Circle() {
		/* r = 5;
		*x = 3;
		*y = 2;
		*/
		
		System.out.println("Input radius of a circle");		
		inR = new Scanner(System.in);
		for (; ;){
			this.r = inR.nextDouble();
			if (r>0){
				break;
			} else {
				System.out.println("Radius can not be zero or You're input negative number");	
			}
		}
		System.out.println("Input coordinate 'x' of a circle");
		inX = new Scanner(System.in);
		if (inX.hasNextInt()){			
			this.x = inX.nextInt();
			}
		System.out.println("Input coordinate 'y' of a circle");
		inY = new Scanner(System.in);
		if (inY.hasNextInt()){			
			this.y = inY.nextInt();
			}
	}
	 
	double circumference(){
		return Math.rint(r*PI*100.0)/100;
	}
	public String toString(){
		return "circumference " + circumference() + ", position (" + x + ";" + y + ")"; 
	}
	void moveToTheRandomCoordinate(){
		Random rand = new Random();
		this.x = -99 + rand.nextInt(200);
		this.y = -99 + rand.nextInt(200);
	}
	
	double distanceOfCirclesCenter(Circle circle){
		double s = Math.sqrt((x-circle.x)*(x-circle.x)+(y-circle.y)*(y-circle.y));
		return Math.rint(s*100.0/100.0);
	}
	String cirlceTouchOnce (Circle circle){
		String touches;
		double s = Math.sqrt((x-circle.x)*(x-circle.x)+(y-circle.y)*(y-circle.y));
		if (s==Math.abs(r-circle.r)){
			touches = "Circles touches once";			
		}else if (s==Math.abs(r+circle.r)){
			touches = "Circles touches once";
		}else touches = "Circles touches more than once or do not touch";
		return touches;
	}
}
