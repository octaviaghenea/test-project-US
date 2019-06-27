package pages.checkout;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class OrderSuccessPage extends AbstractPage {
	
	@FindBy(css = ".page-title span")
	private WebElementFacade thankYouMessage;
	
	@FindBy(css = ".action.primary.continue")
	private WebElementFacade continueShoppingButton;
	
	@FindBy(css = "input.action")
	private WebElementFacade createAccountButton;
	
	public String getThankYouMessage() {
		thankYouMessage.waitUntilNotVisible();
		waitForElementToAppear(thankYouMessage, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		return thankYouMessage.getText();
	}

	public void createAccount() {
		element(createAccountButton).waitUntilVisible();
		createAccountButton.click();
	}
}
