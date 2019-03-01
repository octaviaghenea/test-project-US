package tools.models;

public class ProductModel {
	private String productName;
	private String productSku;
	private String productPrice;
	private String priceWithPErsonalizationLabel;
	
	public String getPriceWithPErsonalizationLabel() {
		return priceWithPErsonalizationLabel;
	}

	public void setPriceWithPErsonalizationLabel(String priceWithPErsonalizationLabel) {
		this.priceWithPErsonalizationLabel = priceWithPErsonalizationLabel;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
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
		return "ProductModel [productName=" + productName + ", productSku=" + productSku + " ]";
	}
}
