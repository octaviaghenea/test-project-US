package tools.entities.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	private String id;
	private String sku;
	private String name;
	private String attribute_set_id;
	private String price;
	private String status;
	private String visibility;
	private String type_id;
	private String created_at;
	private String updated_at;
	private String weight;
	private List<CustomAttributes> custom_attributes;
	private ExtensionAttributes extension_attributes;
	private List<Options> options;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttribute_set_id() {
		return attribute_set_id;
	}

	public void setAttribute_set_id(String attribute_set_id) {
		this.attribute_set_id = attribute_set_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public List<CustomAttributes> getCustom_attributes() {
		return custom_attributes;
	}

	public void setCustom_attributes(List<CustomAttributes> custom_attributes) {
		this.custom_attributes = custom_attributes;
	}

	public ExtensionAttributes getExtension_attributes() {
		return extension_attributes;
	}

	public void setExtension_attributes(ExtensionAttributes extension_attributes) {
		this.extension_attributes = extension_attributes;
	}

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
	}

}