package pages.checkout;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class ReviewAndPaymentsPage extends AbstractPage {

	@FindBy(css = ".items.payment-methods")
	private WebElementFacade paymentMethodsContainer;

	@FindBy(css = "#billing-address-same-as-shipping-shared")
	private WebElementFacade billingAddressCheckbox;

	@FindBy(css = "._active button.action.primary.checkout")
	private WebElementFacade placeOrderButton;

	public void selectPaymentMethod(String method) {
		element(paymentMethodsContainer).waitUntilVisible();

		List<WebElement> paymentMethodsList = paymentMethodsContainer.findElements(By.cssSelector("div label[for]"));

		for (WebElement elementNow : paymentMethodsList) {
			String labelNow = elementNow.getText();
			if ((labelNow).contains(method)) {
				elementNow.click();
				break;
			}
		}
	}

	public void checkBillingAddress() {
		element(billingAddressCheckbox).waitUntilVisible();
		billingAddressCheckbox.click();
	}

	public void hitPlaceOrder() {
		element(placeOrderButton).waitUntilVisible();
		placeOrderButton.click();
	}
}
