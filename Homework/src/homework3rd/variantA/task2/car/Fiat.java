package homework3rd.variantA.task2.car;

import homework3rd.variantA.task2.carComponent.Wheel;

public class Fiat extends Car {
	
	public Fiat(){
		super();
	}
	
	public Wheel[] getWheel() {
		return wheel;
	}
	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}
	
}
