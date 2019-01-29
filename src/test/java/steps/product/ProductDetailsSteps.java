package steps.product;

import net.thucydides.core.annotations.Step;
import pages.product.ProductDetailsPage;

public class ProductDetailsSteps {
	
	ProductDetailsPage productdetailsPage;
	
	@Step
	public void setQuantity(String qty) {
		productdetailsPage.setQuantity(qty);
	}
	
	@Step
	public void addToCard() {
		productdetailsPage.addToCart();
	}

}
