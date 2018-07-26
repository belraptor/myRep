package homework3rd.variantA.task2.carComponent;

public class Engine {
	final int amountOfCylinder;
	final double engineVolume;
	
	
	@Override
	public String toString() {
		return "Engine [amountOfCylinder=" + amountOfCylinder + ", engineVolume=" + engineVolume + "]";
	}


	public Engine (int amountOfCylinder, double engineVolume){
		this.amountOfCylinder=amountOfCylinder;
		this.engineVolume=engineVolume;
	}
}
