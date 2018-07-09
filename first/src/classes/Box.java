package classes;

public class Box {
	double width;
	double height;
	double depth;
	String color;
	
	
	Box () {
		width = 2.5;
		height = 2;
		depth = 2;
		color = "Red";
		
	}
	
	Box (double width, double height, double depth, String color){
		this.width = width;
		this.height =height; 
		this.depth = depth;
		this.color = color;		
	}
	void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	public String toString() {
		return "width :" + width + " height: " + height + " depth: " + depth + " color: " + color + " volume: " + volume();
	}
	double volume(){
		return width * height * depth;
	}
	
}
