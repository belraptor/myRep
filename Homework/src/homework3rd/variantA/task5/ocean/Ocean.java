package homework3rd.variantA.task5.ocean;

public abstract class Ocean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ocean [name=" + name + "]";
	}
	
}
