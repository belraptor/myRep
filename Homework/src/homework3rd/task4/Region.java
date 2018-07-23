package homework3rd.task4;

import java.util.List;

public abstract class Region {

	private String regionalCenter;
	private double area;
	List <Region> regionList;
	
	
	
	public String getRegionalCenter() {
		return regionalCenter;
	}
	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}
	
	public String toString(){
		return "Region [regional center: " + regionalCenter+ " area: " + regionalCenter + "]";
	}
	public List<Region> getRegionList(){
		return regionList;
	}
	public void setRegionList(List<Region> regionList){
	this.regionList = regionList;	
	}
			
}
