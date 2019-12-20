package tools.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import tools.entities.productMagento.CustomAttributes;
import tools.entities.productMagento.Options;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogMagento {

	private String name;
	private String sku;
	private String price;

	private List<Options> options;
	/*
	 * private List<CustomAttributes> custom_attributes;
	 * 
	 * 
	 * public List<CustomAttributes> getCustom_attributes() { return
	 * custom_attributes; }
	 * 
	 * public void setCustom_attributes(List<CustomAttributes>
	 * custom_attributes) { this.custom_attributes = custom_attributes; }
	 */

	public String getName() {
		return name;
	}

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
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
		return price;
	}

	@Override
	public String toString() {
		return "CatalogMagento [name=" + name + ", sku=" + sku + ", price=" + price + ", options=" + options + "]";
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
