package homework3rd.variantA.task4.regions;

import java.util.List;

public abstract class Region {

	public abstract String regionalCenter();

	public abstract int area();

	List<Region> regionList;

	public String toString() {
		return "Region [regional center: " + regionalCenter() + "  \tarea: " + area() + " sq.km.]";
	}

}
