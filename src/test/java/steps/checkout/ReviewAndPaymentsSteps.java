package steps.checkout;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.checkout.ReviewAndPaymentsPage;
import tools.models.ReviewAndPaymentsModel;

public class ReviewAndPaymentsSteps {

	ReviewAndPaymentsPage reviewAndPaymentsPage;

	@StepGroup
	public void enterPaymentInformation(ReviewAndPaymentsModel payment) {
		selectPaymentMethod(payment.getPaymentMethod());
		enterCardDetails(payment.getCreditCardNumber());
		selectExpirationDate(payment.getExpirationDate());
		selectExpirationYear(payment.getExpirationYear());
		enterCCV(payment.getCcvNumber());
		clickCommentLink();
		enterComment(payment.getComment());
		hitPlaceOrder();
	}

	@Step
	public void selectPaymentMethod(String paymentMethod) {
		reviewAndPaymentsPage.selectPaymentMethod(paymentMethod);
	}

	@Step
	public void selectPaymentMethod() {
		reviewAndPaymentsPage.selectPaymentMethod();
	}

	@Step
	public void enterCardDetails(String details) {
		reviewAndPaymentsPage.enterCardDetails(details);
	}

	@Step
	public void selectExpirationDate(String date) {
		reviewAndPaymentsPage.selectExpirationDate(date);
	}

	@Step
	public void selectExpirationYear(String year) {
		reviewAndPaymentsPage.selectExpirationYear(year);
	}

	@Step
	public void enterCCV(String ccv) {
		reviewAndPaymentsPage.enterCCV(ccv);
	}
	
	@Step
	public void clickCommentLink() {
		reviewAndPaymentsPage.clickCommentLink();
	}
	
	@Step
	public void enterComment(String comment) {
		reviewAndPaymentsPage.enterComment(comment);
	}

	@Step
	public void hitPlaceOrder() {
		reviewAndPaymentsPage.hitPlaceOrder();
	}
}
