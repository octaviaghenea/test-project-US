package pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class CustomerVerificationPage extends AbstractPage {

	@FindBy(css = ".customer-name span")
	private WebElementFacade customerName;

	@FindBy(css = ".message-success div")
	private WebElementFacade thankYouMessage;

	public String getCustomerName() {
		customerName.waitUntilVisible();
		waitForElementToAppear(customerName, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		return customerName.getText();
	}

	public String getThankYouMessage() {
		thankYouMessage.waitUntilVisible();
		waitForElementToAppear(customerName, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		return thankYouMessage.getText();
	}
}
