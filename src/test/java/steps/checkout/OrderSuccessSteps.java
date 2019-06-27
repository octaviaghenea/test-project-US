package steps.checkout;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.checkout.OrderSuccessPage;
import tools.constants.MessageConstants;

public class OrderSuccessSteps {

	OrderSuccessPage orderSuccessPage;

	@Step
	public void verifyThankYouMessage() {
		String actualMessage = orderSuccessPage.getThankYouMessage();
		Assert.assertTrue(
				"Message not correct " + MessageConstants.THANK_YOU__ORDER_MESSAGE + "Actual: " + actualMessage,
				MessageConstants.THANK_YOU__ORDER_MESSAGE.contentEquals(actualMessage));
	}

	@Step
	public void createAnAccount() {
		orderSuccessPage.createAccount();
	}
}
