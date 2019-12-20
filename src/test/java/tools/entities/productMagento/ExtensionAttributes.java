package tools.entities.productMagento;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class ExtensionAttributes {

	private List<String> website_ids;
	private List<CategoryLinks> category_links;
	private StockItem stock_item;

	public List<String> getWebsite_ids() {
		return website_ids;
	}

	public void setWebsite_ids(List<String> website_ids) {
		this.website_ids = website_ids;
	}

	public List<CategoryLinks> getCategory_links() {
		return category_links;
	}

	public void setCategory_links(List<CategoryLinks> category_links) {
		this.category_links = category_links;
	}

	public StockItem getStock_item() {
		return stock_item;
	}

	public void setStock_item(StockItem stock_item) {
		this.stock_item = stock_item;
	}

	@Override
	public String toString() {
		return "ExtensionAttributes [website_ids=" + website_ids + ", category_links=" + category_links
				+ ", stock_item=" + stock_item + "]";
	}
}
