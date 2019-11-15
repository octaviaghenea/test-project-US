package tools.entities.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Options {

	private String product_sku;
	private String title;
	private String type;
	private String sort_order;
	private boolean is_require;
	private String price;
	private String price_type;
	private String max_characters;

	private List<OptionValues> values;

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

	public String getSort_order() {
		return sort_order;
	}

	public void setSort_order(String sort_order) {
		this.sort_order = sort_order;
	}

	public boolean isIs_require() {
		return is_require;
	}

	public void setIs_require(boolean is_require) {
		this.is_require = is_require;
	}

	public List<OptionValues> getValues() {
		return values;
	}

	public void setValues(List<OptionValues> values) {
		this.values = values;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice_type() {
		return price_type;
	}

	public void setPrice_type(String price_type) {
		this.price_type = price_type;
	}

	public String getMax_characters() {
		return max_characters;
	}

	public void setMax_characters(String max_characters) {
		this.max_characters = max_characters;
	}
}
