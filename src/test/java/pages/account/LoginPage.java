package pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class LoginPage extends AbstractPage {

	@FindBy(css = "#email")
	private WebElementFacade emailInput;

	@FindBy(css = ".control input[name='login[password]']")
	private WebElementFacade passInput;

	@FindBy(css = "button#send2.action.login")
	private WebElementFacade signInButton;

	@FindBy(css = ".primary a.action.create")
	private WebElementFacade createAccountButton;

	@FindBy(css = ".message-error div")
	private WebElementFacade loginErrornMessage;

	public void fillEmailInput(String email) {
		element(emailInput).waitUntilVisible();
		emailInput.type(email);
	}

	public void fillPasswordInput(String password) {
		element(passInput).waitUntilVisible();
		passInput.type(password);
	}

	public void hitSignIn() {
		element(signInButton).waitUntilVisible();
		signInButton.click();
	}

	public void hitCreateAccountButton() {
		element(createAccountButton).waitUntilVisible();
		createAccountButton.click();
	}

	public String getLoginErrorMessage() {
		loginErrornMessage.waitUntilVisible();
		waitABit(4000);
		return loginErrornMessage.getText();
	}
}
