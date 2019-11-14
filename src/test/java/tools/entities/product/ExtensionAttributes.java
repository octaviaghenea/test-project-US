package tools.entities.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ExtensionAttributes {

	private List<String> website_ids;
	private List<CategoryLinks> category_links;
	private StockItem stock_item;

	public List<String> getWebsiteIds() {
		return website_ids;
	}

	public void setWebsiteIds(List<String> websiteIds) {
		this.website_ids = websiteIds;
	}

	public List<CategoryLinks> getCategoryLinks() {
		return category_links;
	}

	public void setCategoryLinks(List<CategoryLinks> categoryLinks) {
		this.category_links = categoryLinks;
	}

	public StockItem getStockItem() {
		return stock_item;
	}

	public void setStockItem(StockItem stockItem) {
		this.stock_item = stockItem;
	}

	@Override
	public String toString() {
		return "ExtensionAttributes [websiteIds=" + website_ids + ", categoryLinks=" + category_links + ", stockItem="
				+ stock_item + "]";
	}

}
