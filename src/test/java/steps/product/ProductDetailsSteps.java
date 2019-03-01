package steps.product;

import java.math.BigDecimal;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.product.ProductDetailsPage;
import pages.product.ProductPersonalizationPage;
import tools.constants.MessageConstants;
import tools.models.ProductPersonalizationModel;

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
	public void goToReviewsTab() {
		productDetailsPage.goToReviewsTab();
	}

	public void verifySuccessfullyAddedMessage() {
		String actualMessage = productDetailsPage.getAddedToCartMessage();
		Assert.assertTrue(
				"Thank you message not correct. Expected: " + MessageConstants.SUCCESSFULLY_ADDED_PRODUCT_MESSAGE
						+ "Actual: " + actualMessage,
				MessageConstants.SUCCESSFULLY_ADDED_PRODUCT_MESSAGE.contains(actualMessage));
	}

	public void verifyUnitPrice(ProductPersonalizationModel product) {
		String expectedCost = ProductDetailsSteps.sum(product).toString();
		String actualCost = productDetailsPage.getPriceWithPersonalization();
		Assert.assertTrue("Cost not correct: " + expectedCost + " Actual cost: " + actualCost,
				expectedCost.equals(actualCost));
	}

	public static BigDecimal sum(ProductPersonalizationModel product) {

		return BigDecimal.valueOf(Double.parseDouble(product.getProductPrice()))
				.add(BigDecimal.valueOf(Double.parseDouble(product.getPersonalizationCost())));
	}
}
