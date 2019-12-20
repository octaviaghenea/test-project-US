package tools.models;

public class OSCProductModel {

	private String productName;
	private String productDescription;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "OSCProductModel [productName=" + productName + ", productDescription=" + productDescription + "]";
	}

}
