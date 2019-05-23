package tools.models;

public class CartModel extends ProductPersonalizationModel {

	private String itemQty;
	private String itemSubtotal;

	public String getItemQty() {
		return itemQty;
	}

	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	public String getItemSubtotal() {
		return itemSubtotal;
	}

	public void setItemSubtotal(String itemSubtotal) {
		this.itemSubtotal = itemSubtotal;
	}

	@Override
	public String toString() {
		return "CartModel [itemQty=" + itemQty + ", itemSubtotal=" + itemSubtotal + ", toString()=" + super.toString()
				+ "]";
	}
}
