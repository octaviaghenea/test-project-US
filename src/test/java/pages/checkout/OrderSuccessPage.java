package pages.checkout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
				
		By loader = By.className("loader");
		waitForLoaderToDissapear(loader, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		waitUntilPageLoads();
		waitForLoaderToDissapear(loader, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		

		int counter = 1;
		while (thankYouMessage.isPresent() == false && counter > 30) {
			waitABit(100);
			counter++;			
		}
		
		thankYouMessage.waitUntilVisible();
		return thankYouMessage.getText();
	}

	public void createAccount() {
		element(createAccountButton).waitUntilVisible();
		createAccountButton.click();
	}
}
