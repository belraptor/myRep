package homework3rd.variantA.task2.carComponent;

public class Wheel {
	
	private String position;
	final int DISK_DIAMETER;
	final int WIDTH;
	final int HEIGHT;
	int serialNumber;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + serialNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (serialNumber != other.serialNumber)
			return false;
		return true;
	}

	public Wheel(int DISK_DIAMETER, int WIDTH, int HEIGHT){
	this.DISK_DIAMETER=DISK_DIAMETER;
	this.WIDTH=WIDTH;
	this.HEIGHT=HEIGHT;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String toString(){
		return "R"+DISK_DIAMETER + " " + WIDTH +"/" + HEIGHT + "\t" + position;
	}
}
