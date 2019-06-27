package steps.checkout;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.checkout.ReviewAndPaymentsPage;

public class ReviewAndPaymentsSteps {

	ReviewAndPaymentsPage reviewAndPaymentsPage;
	
	@StepGroup
	public void enterPaymentInformation() {
		selectPaymentMethod("Check / Money order");
		hitPlaceOrder();
	}
	

	@Step
	public void selectPaymentMethod(String method) {
		reviewAndPaymentsPage.selectPaymentMethod(method);
	}

	@Step
	public void hitPlaceOrder() {
		reviewAndPaymentsPage.hitPlaceOrder();
	}
}
