package tools.productCalculations;

import java.math.BigDecimal;
import java.util.Map;

import tools.models.ProductPersonalizationModel;

public class ProductCalculations {

	public static String calculateCostProductTotal(String... producCosts) {

		BigDecimal total = BigDecimal.ZERO;

		for (String price : producCosts) {
			total = total.add(BigDecimal.valueOf(Double.parseDouble(price)));
		}

		return String.valueOf(total);
	}

	public static String calculateProductOptionsTotal(Map<String, String> options) {

		BigDecimal total = BigDecimal.ZERO;

		for (String value : options.values()) {
			total = total.add(BigDecimal.valueOf(Double.parseDouble(value)));
		}

		return String.valueOf(total);
	}

	public static BigDecimal calculateUnitPrice(ProductPersonalizationModel product) {

		return BigDecimal.valueOf(Double.parseDouble(product.getProductPrice()))
				.add(BigDecimal.valueOf(Double.parseDouble(product.getPersonalizationCost())));
	}
	
	

	/*
	 * public static void main(String[] args) { ProductPersonalizationModel
	 * product = new ProductPersonalizationModel(); sum(product); }
	 */
}
