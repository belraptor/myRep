package homework3rd.variantA.task4.country;

public abstract class Country {
	private String name;
	private String capital;
	private int area;

//	public String toString() {
//		return "Country: " + name + ", capital: " + capital + "area:" + area;
//	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
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
