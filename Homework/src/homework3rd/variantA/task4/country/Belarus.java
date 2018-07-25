package homework3rd.variantA.task4.country;

import homework3rd.variantA.task4.regions.Region;

public class Belarus extends Country {
	private Region[] belarusRegions = new Region[6];

	public Belarus() {
		super();
	}

	int area = 207595;

	public Region[] getBelarusRegions() {
		return belarusRegions;
	}

	public void setBelarusRegions(Region[] belarusRegions) {
		this.belarusRegions = belarusRegions;
	}
}
