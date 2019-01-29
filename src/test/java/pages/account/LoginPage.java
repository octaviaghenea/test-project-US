package pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	@FindBy(css = "#email")
	private WebElementFacade emailInput;

	@FindBy(css = ".control input[name='login[password]']")
	private WebElementFacade passInput;

	@FindBy(css = "button#send2.action.login")
	private WebElementFacade signInButton;
	
	@FindBy(css = ".primary a.action.create")
	private WebElementFacade createAccountButton;

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

}
