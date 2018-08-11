package homework5th;

@Version(version = 1.0, codeName="javaBegginer")
public class MyService {

	private String product;
	private String lightSource;
	private int numberOfLightSources;

	MyService(String product, String lightSource, int numberOfLightSources) {
		this.product = product;
		this.lightSource = lightSource;
		this.numberOfLightSources = numberOfLightSources;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getLightSource() {
		return lightSource;
	}

	public void setLightSource(String lightSource) {
		this.lightSource = lightSource;
	}

	public int getNumberOfLightSources() {
		return numberOfLightSources;
	}

	public void setNumberOfLightSources(int numberOfLightSources) {
		this.numberOfLightSources = numberOfLightSources;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lightSource == null) ? 0 : lightSource.hashCode());
		result = prime * result + numberOfLightSources;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
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
		MyService other = (MyService) obj;
		if (lightSource == null) {
			if (other.lightSource != null)
				return false;
		} else if (!lightSource.equals(other.lightSource))
			return false;
		if (numberOfLightSources != other.numberOfLightSources)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

	
	public /*private*/ String thisClassInfo() {
		return "MyService [product=" + product + ", lightSource=" + lightSource + ", numberOfLightSources="
				+ numberOfLightSources + "]";
	}

}
