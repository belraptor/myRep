package homework3rd.task4;

public abstract class Country {
	private String name;
	private String capital;
	public int area;
/*
	Country(String name, String capital, int area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
*/
	public String toString() {
		return "Country: " + name + ", capital: " + capital;
	}

	public double getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
