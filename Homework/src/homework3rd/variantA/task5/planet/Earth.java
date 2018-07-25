package homework3rd.variantA.task5.planet;
import homework3rd.variantA.task5.continent.Continent;


public class Earth extends Planet{
	private Continent [] earthContinents = new Continent[2];
	public Earth() {
		super();
	}
	public Continent[] getEarthContinents() {
		return earthContinents;
	}
	public void setEarthContinents(Continent[] earthContinents) {
		this.earthContinents = earthContinents;
	}
	
}
