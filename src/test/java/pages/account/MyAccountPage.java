package pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

	@FindBy(css = ".customer-name span")
	private WebElementFacade customerName;

	@FindBy(css = ".message-success div")
	private WebElementFacade thankYouMessage;

	public String getCustomerName() {
		customerName.waitUntilVisible();
		// TODO imi sangereaza ochii la wait
		waitABit(4000);
		return customerName.getText();
	}

	public String getThankYouMessage() {
		thankYouMessage.waitUntilVisible();
		waitABit(4000);
		return thankYouMessage.getText();
	}
}
