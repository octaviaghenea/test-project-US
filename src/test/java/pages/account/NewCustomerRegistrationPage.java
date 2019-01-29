package pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewCustomerRegistrationPage extends PageObject {

	@FindBy(css = "#firstname")
	private WebElementFacade firstnameInput;

	@FindBy(css = "#lastname")
	private WebElementFacade lastNameInput;

	@FindBy(css = "#is_subscribed")
	private WebElementFacade signUpNewsletterCheckbox;

	@FindBy(css = "#email_address")
	private WebElementFacade emailAddressInput;

	@FindBy(css = "input#password")
	private WebElementFacade passwordInput;

	@FindBy(css = "#password-confirmation")
	private WebElementFacade passConfirmationInput;

	@FindBy(css = ".primary button.action.submit.primary")
	private WebElementFacade submitButton;
	
	public void enterFirstName(String firstname) {
		element(firstnameInput).waitUntilVisible();
		firstnameInput.type(firstname);
	}

	public void enterLastName(String lastname) {
		element(lastNameInput).waitUntilVisible();
		lastNameInput.type(lastname);
	}

	public void hitNewsletterSignUp() {
		element(signUpNewsletterCheckbox).waitUntilVisible();
		signUpNewsletterCheckbox.click();
	}

	public void enterEmailAddress(String email) {
		element(emailAddressInput).waitUntilVisible();
		emailAddressInput.type(email);
	}

	public void enterPassword(String password) {
		element(passwordInput).waitUntilVisible();
		passwordInput.type(password);
	}

	public void enterPassConfirmation(String confirm) {
		element(passConfirmationInput).waitUntilVisible();
		passConfirmationInput.type(confirm);
	}

	public void hitCreate() {
		element(submitButton).waitUntilVisible();
		submitButton.click();
	}

}
