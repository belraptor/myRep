package homework3rd.variantA.task5;

import homework3rd.variantA.task5.continent.Afrika;
import homework3rd.variantA.task5.continent.Australia;
import homework3rd.variantA.task5.continent.Continent;

import homework3rd.variantA.task5.planet.Earth;

public class Runner {
	public static void main(String[] args) {
		Earth earth = new Earth();
		earth.setName("Earth");

		int i = 0;
		Continent afrika = new Afrika();
		afrika.setName("Afrika");
		earth.getEarthContinents()[i++] = afrika;
		Continent australia = new Australia();
		australia.setName("Australia");
		earth.getEarthContinents()[i] = australia;
		System.out.println("Planet: " + earth.getName()+ "\tnumber of continents: " + earth.getEarthContinents().length);
		for (i = 0; i < earth.getEarthContinents().length; i++)
			System.out.println(earth.getEarthContinents()[i]);

	}
}
