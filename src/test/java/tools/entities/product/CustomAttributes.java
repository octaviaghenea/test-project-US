package tools.entities.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CustomAttributes {

	private String value;
	private String attribute_code;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAttributeCode() {
		return attribute_code;
	}

	public void setAttributeCode(String attribute_code) {
		this.attribute_code = attribute_code;
	}

	@Override
	public String toString() {
		return "CustomAttributes [value = " + value + ", attributeCode = " + attribute_code + "]";
	}

}
