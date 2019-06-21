package pages.checkout;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class LoginOrGuestPage extends AbstractPage {

	@FindBy(css = ".guest")
	private WebElementFacade continueAsGuestButton;

	@FindBy(css = "#login-email")
	private WebElementFacade emailField;

	@FindBy(css = "#login-password")
	private WebElementFacade passwordField;

	@FindBy(css = ".form .primary button.action.action-login")
	private WebElementFacade logInButton;

	public void continueAsGues() {
		element(continueAsGuestButton).waitUntilVisible();
		continueAsGuestButton.click();
	}

	public void enterEmail(String email) {
		element(emailField).waitUntilVisible();
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
