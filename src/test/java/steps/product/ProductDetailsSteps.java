package steps.product;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;
import pages.product.ProductDetailsPage;
import pages.product.ProductPersonalizationPage;
import tools.constants.MessageConstants;
import tools.models.ProductPersonalizationModel;
import tools.productCalculations.ProductCalculations;

public class ProductDetailsSteps {

	ProductDetailsPage productDetailsPage;
	ProductPersonalizationPage productPersonalizationPage;

	@Step
	public void setQuantity(String qty) {
		productDetailsPage.setQuantity(qty);
	}

	@Step
	public void addToCard() {
		productDetailsPage.addToCart();
	}

	@Step
	public void goToWriteAReview() {
		productDetailsPage.goToWriteAReview();
	}

	public void verifySuccessfullyAddedMessage() {
		String actualMessage = productDetailsPage.getAddedToCartMessage();
		Assert.assertTrue(
				"Thank you message not correct. Expected: " + MessageConstants.SUCCESSFULLY_ADDED_PRODUCT_MESSAGE
						+ "Actual: " + actualMessage,
				MessageConstants.SUCCESSFULLY_ADDED_PRODUCT_MESSAGE.contains(actualMessage));
	}

	@Title("Verify product price after personalization")
	@Step
	public void verifyUnitPrice(ProductPersonalizationModel product) {
		String expectedCost = ProductCalculations.calculateUnitPrice(product).toString();
		String actualCost = productDetailsPage.getPriceWithPersonalization();
		Assert.assertTrue("Cost not correct: " + expectedCost + " Actual cost: " + actualCost,
				expectedCost.equals(actualCost));
	}
}
