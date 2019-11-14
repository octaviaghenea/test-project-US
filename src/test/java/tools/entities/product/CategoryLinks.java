package tools.entities.product;

public class CategoryLinks {

	private String position;
	private String category_id;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCategoryID() {
		return category_id;
	}

	public void setCategoryID(String categoryID) {
		this.category_id = categoryID;
	}

	@Override
	public String toString() {
		return "CategoryLinks [position=" + position + ", categoryID=" + category_id + "]";
	}
}
