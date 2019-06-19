package pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class AddressBookPage extends AbstractPage {

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

	@FindBy(css = " button.action.primary.add")
	private WebElementFacade addNewAddressButton;

	@FindBy(css = "input[name='default_billing']")
	private WebElementFacade billingAddressCheckbox;

	@FindBy(id = "primary_shipping")
	private WebElementFacade shippingAddressCheckbox;

	public void enterCompanyName(String company) {
		element(companyField).waitUntilVisible();
		companyField.type(company);
	}

	public void enterPhoneNumber(String phoneNumber) {
		element(telephoneField).waitUntilVisible();
		telephoneField.type(phoneNumber);
	}

	public void enterAddress(String address) {
		element(streetField).waitUntilVisible();
		streetField.type(address);
	}

	public void enterCityName(String city) {
		element(cityField).waitUntilVisible();
		cityField.type(city);
	}

	public void selectState(String state) {
		Select region = new Select(regionField);
		region.selectByVisibleText(state);
	}

	public void enterZipCode(String zip) {
		element(zipCodeField).waitUntilVisible();
		zipCodeField.type(zip);
	}

	public void selectBillingCheckbox() {
		element(billingAddressCheckbox).waitUntilVisible();
		waitForElementToAppear(billingAddressCheckbox, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		billingAddressCheckbox.click();
	}

	public void selectShippingCheckbox() {
		element(shippingAddressCheckbox).waitUntilVisible();
		waitForElementToAppear(shippingAddressCheckbox, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		shippingAddressCheckbox.click();
	}

	public void hitSaveButton() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}

	public void clickAdditionalAddressButton() {
		element(addNewAddressButton).waitUntilVisible();
		addNewAddressButton.click();
	}
}
