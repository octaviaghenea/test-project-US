package tools.productCalculations;

import java.math.BigDecimal;
import java.util.Map;

public class ProductCalculations {

	public static String calculateCostProductTotal(String... producCosts) {

		BigDecimal total = BigDecimal.ZERO;

		for (String price : producCosts) {
			total = total.add(BigDecimal.valueOf(Double.parseDouble(price)));
		}

		return String.valueOf(total);
	}

	public static String calculateCostProductTotal(Map<String, String> options) {

		BigDecimal total = BigDecimal.ZERO;

		for (String value : options.values()) {
			// System.out.println("@@@ " + value);
			total = total.add(BigDecimal.valueOf(Double.parseDouble(value)));
		}

		return String.valueOf(total);
	}
}
