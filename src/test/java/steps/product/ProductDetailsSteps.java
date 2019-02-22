package steps.product;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.product.ProductDetailsPage;
import tools.constants.MessageConstants;

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

	@Step
	public void goToReviewsTab() {
		productdetailsPage.goToReviewsTab();
	}

	public void verifySuccessfullyAddedMessage() {
		String actualMessage = productdetailsPage.getAddedToCartMessage();
		Assert.assertTrue(
				"Thank you message not correct. Expected: " + MessageConstants.SUCCESSFULLY_ADDED_PRODUCT_MESSAGE
						+ "Actual: " + actualMessage,
				MessageConstants.SUCCESSFULLY_ADDED_PRODUCT_MESSAGE.contains(actualMessage));
	}
}
