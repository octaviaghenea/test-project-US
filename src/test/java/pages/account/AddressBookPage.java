package pages.account;

import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddressBookPage extends PageObject {

	@FindBy(id = "firstname")
	private WebElementFacade firstNameField;

	@FindBy(id = "lastname")
	private WebElementFacade lastNameField;

	@FindBy(id = "company")
	private WebElementFacade companyField;

	@FindBy(id = "telephone")
	private WebElementFacade telephoneField;

	@FindBy(id = "street_1")
	private WebElementFacade streetField;

	@FindBy(id = "city")
	private WebElementFacade cityField;

	@FindBy(id = "region_id")
	private WebElementFacade regionField;

	@FindBy(id = "zip")
	private WebElementFacade zipCodeField;

	@FindBy(css = ".actions-toolbar button[title]")
	private WebElementFacade saveButton;

	public void enterCompanyName(String company) {
		companyField.type(company);
	}

	public void enterPhoneNumber(String phoneNumber) {
		telephoneField.type(phoneNumber);
	}

	public void enterAddress(String address) {
		streetField.type(address);
	}

	public void enterCityName(String city) {
		cityField.type(city);
	}

	public void SelectState(String state) {
		Select region = new Select(regionField);
		region.selectByVisibleText(state);
	}

	public void enterZipCode(String zip) {
		zipCodeField.type(zip);
	}

	public void hitSaveButton() {
		saveButton.click();		
	}
}
