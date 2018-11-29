package tools.models;

public class ProductModel {
	private String productName;
	private String productSku;
	private String firstOption;
	private String secondOption;
	private String firstLine;
	private String secondLine;
	private String thirdOption;

	public String getFirstOption() {
		return firstOption;
	}

	public void setFirstOption(String firstOption) {
		this.firstOption = firstOption;
	}

	public String getSecondOption() {
		return secondOption;
	}

	public void setSecondOption(String secondOption) {
		this.secondOption = secondOption;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getThirdOption() {
		return thirdOption;
	}

	public void setThirdOption(String thirdOption) {
		this.thirdOption = thirdOption;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSku() {
		return productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	@Override
	public String toString() {
		return "ProductModel [productName=" + productName + ", productSku=" + productSku + ", firstOption="
				+ firstOption + ", secondOption=" + secondOption + ", firstLine=" + firstLine + ", secondLine="
				+ secondLine + ", thirdOption=" + thirdOption + "]";
	}

}
