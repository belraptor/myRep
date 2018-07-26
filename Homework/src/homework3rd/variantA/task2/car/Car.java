package homework3rd.variantA.task2.car;

import homework3rd.variantA.task2.carComponent.Wheel;

public abstract class Car {
	private String carBrand;
	protected Wheel [] wheel = new Wheel[4];
	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String driven() {
		return "I'm driving";
	}

	public String refuel() {
		return "I'm refueling \n............................. \nTank full";
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + "]";
	}

	public Wheel [] getWheel() {
		return wheel;
	}

	public void setWheel(Wheel [] wheel) {
		this.wheel = wheel;
	}
	public String changeWheel(Wheel [] wheel) {
		this.wheel = wheel;
		return "wheel changed";
	}
	

}
