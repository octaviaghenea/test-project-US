package tools.entities.productOSC;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class OptionsOSC {

	private int option_id;
	private String name;
	private int sort_order;

	public int getOption_id() {
		return option_id;
	}

	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSort_order() {
		return sort_order;
	}

	public void setSort_order(int sort_order) {
		this.sort_order = sort_order;
	}

	/*
	 * "option_id": 2013, "name": "Choose Themed Charm", "type": 0, "html":
	 * null, "slug": "theme_charm_may2019", "language_id": 1, "max_length": 0,
	 * "is_trigger": 0, "dependency_for": 0, "sort_order": 13
	 */

}
