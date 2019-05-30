package pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class AccountInformationPage extends AbstractPage {

	@FindBy(id = "firstname")
	private WebElementFacade firstNameField;

	@FindBy(id = "lastname")
	private WebElementFacade lastNameField;
	
	@FindBy(css = ".actions-toolbar button[title=Save]")
	private WebElementFacade saveButton;

	public void editUserFirstName(String value) {
		element(firstNameField).waitUntilVisible();
		firstNameField.type(value);
	}

	public void editUserLastName(String value) {
		element(lastNameField).waitUntilVisible();
		lastNameField.type(value);
	}
	
	public void hitSaveButton() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}
}
