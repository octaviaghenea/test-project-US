package tools.models;

public class ProductModel {
	private String productName;
	private String productSku;
	private String firstOption;
	private String secondOption;
	private String thirdOption;
	private String firstLine;
	private String secondLine;
	private String thirdLine;
	private String fourthLine;
	private String firstPoem;;
	private String secondPoem;
	private String croppingNotes;
	private String labelOption;
	private String labelLine;

	
	public String getLabelOption() {
		return labelOption;
	}

	public void setLabelOption(String label) {
		this.labelOption = label;
	}

	public String getLabelLine() {
		return labelLine;
	}

	public void setLabelLine(String labelLine) {
		this.labelLine = labelLine;
	}

	public String getFirstPoem() {
		return firstPoem;
	}

	public void setFirstPoem(String firstPoem) {
		this.firstPoem = firstPoem;
	}

	public String getSecondPoem() {
		return secondPoem;
	}

	public void setSecondPoem(String secondPoem) {
		this.secondPoem = secondPoem;
	}


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
	
	public String getThirdLine() {
		return thirdLine;
	}

	public void setThirdLine(String thirdLine) {
		this.thirdLine = thirdLine;
	}

	public String getFourthLine() {
		return fourthLine;
	}

	public void setFourthLine(String fourthLine) {
		this.fourthLine = fourthLine;
	}

	public String getThirdOption() {
		return thirdOption;
	}

	public void setThirdOption(String thirdOption) {
		this.thirdOption = thirdOption;
	}

	public String getCroppingNotes() {
		return croppingNotes;
	}

	public void setCroppingNotes(String croppingNotes) {
		this.croppingNotes = croppingNotes;
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
				+ secondLine + ", thirdOption=" + thirdOption + ", croppingNotes=" + croppingNotes + "]";
	}

}
