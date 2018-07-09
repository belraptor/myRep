package classes;

public class Runner {

	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		Box mybox2 = new Box(1.5, 2.5, 2, "Blue");
		Box mybox3 = new Box();
		mybox3.setDim(2.5, 4, 3.2);
		
		System.out.println(mybox1 + "\n" + mybox2+ "\n" + mybox3);
		
		
		
		
	}

}
