package tools.models;

public class ProductModel {
	private String productName;
	private String productSku;

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
