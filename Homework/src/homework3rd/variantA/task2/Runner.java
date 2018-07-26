package homework3rd.variantA.task2;


import homework3rd.variantA.task2.car.Car;
import homework3rd.variantA.task2.car.Fiat;
import homework3rd.variantA.task2.carComponent.Engine;
import homework3rd.variantA.task2.carComponent.Wheel;

public class Runner {
public static void main(String[] args) {
	Car fiat = new Fiat();
	fiat.setCarBrand("Fiat");
	int i =0;
	Wheel wheelFrontLeft= new Wheel(15,175,65);
	wheelFrontLeft.setPosition("Front Left");
	fiat.getWheel()[i++]=wheelFrontLeft;
	Wheel wheelFrontRight= new Wheel(15,175,65);
	wheelFrontRight.setPosition("Front Right");
	fiat.getWheel()[i++]=wheelFrontRight;
	Wheel wheelRearLeft= new Wheel(15,175,65);
	wheelRearLeft.setPosition("Rear Left");
	fiat.getWheel()[i++]=wheelRearLeft;
	Wheel wheelRearRight= new Wheel(15,175,65);
	wheelRearRight.setPosition("Rear Right");
	fiat.getWheel()[i]=wheelRearRight;
	Engine engine1 = new Engine(4, 1.2);
	System.out.println(fiat.toString());
	System.out.println(fiat.driven());
	System.out.println(fiat.refuel());
	for(i=0; i< fiat.getWheel().length; i++){
		System.out.println(fiat.getWheel()[i]);
	}
	System.out.println(engine1.toString());
	
	
}
}
