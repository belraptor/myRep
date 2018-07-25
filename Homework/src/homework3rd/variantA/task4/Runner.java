package homework3rd.variantA.task4;

import homework3rd.variantA.task4.country.Belarus;

import homework3rd.variantA.task4.regions.*;

public class Runner {
	public static void main(String[] args) {

		Belarus belarus = new Belarus();
		belarus.setName("Belarus");
		belarus.setCapital("Minsk");
		belarus.setArea(207595);
		int i = 0;
		Region minskRegion = new MinskRegion();
		belarus.getBelarusRegions()[i] = minskRegion;
		Region brestRegion = new BrestRegion();
		belarus.getBelarusRegions()[++i] = brestRegion;
		Region vitebskRegion = new VitebskRegion();
		belarus.getBelarusRegions()[++i] = vitebskRegion;
		Region gomelRegion = new GomelRegion();
		belarus.getBelarusRegions()[++i] = gomelRegion;
		Region grodnoRegion = new GrodnoRegion();
		belarus.getBelarusRegions()[++i] = grodnoRegion;
		Region mogilevRegion = new MogilevRegion();
		belarus.getBelarusRegions()[++i] = mogilevRegion;
		System.out.println("country: " + belarus.getName() + " capital:" 
		+ belarus.getCapital() + "   \tarea: " + belarus.getArea()
		+ "\tnumber of regions: " + belarus.getBelarusRegions().length);

		for (i = 0; i < belarus.getBelarusRegions().length; i++) {
			System.out.println(belarus.getBelarusRegions()[i]);
		}

	}
}
