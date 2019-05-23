package tools.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import tools.utils.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogOSC {

	private String id;
	private String name;
	private String sku;
	private String price;
	private String cost;
	private String family_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getPrice() {
		return StringUtils.cleanZeroToNothing(price);
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getFamily_id() {
		return family_id;
	}

	public void setFamily_id(String family_id) {
		this.family_id = family_id;
	}
}
