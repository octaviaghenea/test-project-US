package pages.checkout;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class LoginOrGuestPage extends AbstractPage {

	@FindBy(css = "button.guest")
	private WebElementFacade continueAsGuestButton;

	@FindBy(css = "#login-email")
	private WebElementFacade emailField;

	@FindBy(css = "#login-password")
	private WebElementFacade passwordField;

	@FindBy(css = ".form .primary button.action.action-login")
	private WebElementFacade logInButton;

	public void continueAsGuest() {
		By loader = By.className("loader");	
		waitForLoaderToDissapear(loader, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		
		element(continueAsGuestButton).waitUntilVisible();
		waitForElementToAppear(continueAsGuestButton, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		continueAsGuestButton.click();
	}

	public void enterEmail(String email) {
		element(emailField).waitUntilVisible();
		waitForElementToAppear(emailField, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		emailField.type(email);
	}

	public void enterPassword(String password) {
		element(passwordField).waitUntilVisible();
		passwordField.type(password);
	}

	public void hitLogInButton() {
		element(logInButton).waitUntilVisible();
		logInButton.click();
	}
}
