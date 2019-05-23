package tools.utils;

import java.math.BigDecimal;

import tools.models.CartModel;

public class CartCalculations {

	public static BigDecimal calculateSubtotal(CartModel product) {
		return BigDecimal.valueOf(Double.parseDouble(product.getUnitPrice()))
				.multiply(BigDecimal.valueOf(Double.parseDouble(product.getItemQty())));
	}
}
