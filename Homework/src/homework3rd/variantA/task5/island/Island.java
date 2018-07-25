package homework3rd.variantA.task5.island;

public abstract class Island {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Island [name=" + name + "]";
	}

}
