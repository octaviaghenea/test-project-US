package tools.entities.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class CustomAttributes {

	private String value;
	private String attribute_code;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAttribute_code() {
		return attribute_code;
	}

	public void setAttribute_code(String attribute_code) {
		this.attribute_code = attribute_code;
	}
}
