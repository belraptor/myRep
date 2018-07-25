package homework3rd.variantA.task5.continent;

public abstract class Continent  {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Continent: " + name;
	}
}
