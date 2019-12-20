package tools.entities.productMagento;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Options {

	private String product_sku;
	private String title;
	private String type;
	private int sort_order;
	private boolean is_require;

	public String getProduct_sku() {
		return product_sku;
	}

	public void setProduct_sku(String product_sku) {
		this.product_sku = product_sku;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSort_order() {
		return sort_order;
	}

	public void setSort_order(int sort_order) {
		this.sort_order = sort_order;
	}

	public boolean isIs_require() {
		return is_require;
	}

	public void setIs_require(boolean is_require) {
		this.is_require = is_require;
	}

	@Override
	public String toString() {
		return "Options [product_sku=" + product_sku + ", title=" + title + ", type=" + type + ", sort_order="
				+ sort_order + ", is_require=" + is_require + "]";
	}
	
	

}
