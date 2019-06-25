package pages.checkout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class ShippingUnregisteredUsersPage extends AbstractPage {

	@FindBy(css = "#customer-email-fieldset input[name='username']")
	private WebElementFacade emailField;

	@FindBy(css = "#co-shipping-form input[name='firstname']")
	private WebElementFacade firstnameField;

	@FindBy(css = "#co-shipping-form input[name='lastname']")
	private WebElementFacade lastnameField;

	@FindBy(css = "#co-shipping-form input[name='company']")
	private WebElementFacade companyField;

	@FindBy(css = "#co-shipping-form input[name='street[0]']")
	private WebElementFacade streetLine1Field;

	@FindBy(css = "#co-shipping-form input[name='city']")
	private WebElementFacade cityField;

	@FindBy(css = "#co-shipping-form input[name='postcode']")
	private WebElementFacade postcodeField;

	@FindBy(css = "#co-shipping-form input[name='telephone']")
	private WebElementFacade phoneField;

	@FindBy(css = ".table-checkout-shipping-method")
	private WebElementFacade shippingMethodsCondtainer;

	@FindBy(css = "button.action.continue")
	private WebElementFacade nextButton;

	public void enterEmail(String email) {
		element(emailField).waitUntilVisible();
		waitForElementToAppear(emailField, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		emailField.type(email);
	}

	public void enterFirstName(String firstname) {
		element(firstnameField).waitUntilVisible();
		waitForElementToAppear(firstnameField, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		firstnameField.type(firstname);
	}

	public void enterLastName(String lastname) {
		element(lastnameField).waitUntilVisible();
		lastnameField.type(lastname);
	}

	public void enterCompanyName(String company) {
		element(companyField).waitUntilVisible();
		companyField.type(company);
	}

	public void enterStreetAddress(String street) {
		element(streetLine1Field).waitUntilVisible();
		streetLine1Field.type(street);
	}

	public void enterCityName(String city) {
		element(cityField).waitUntilVisible();
		cityField.type(city);
	}

	public void selectState(String visibleText) {
		WebElement select = getDriver().findElement(By.cssSelector("#co-shipping-form select[name='region_id']"));
		List<WebElement> options = select.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if (visibleText.equals(option.getText()))
				option.click();
		}
	}

	public void enterZipCode(String zipcode) {
		element(postcodeField).waitUntilVisible();
		postcodeField.type(zipcode);
	}

	public void enterPhoneNumber(String number) {
		element(phoneField).waitUntilVisible();
		phoneField.type(number);
	}

	public void selectShippingMethod(String shippingMethod) {
		element(shippingMethodsCondtainer).waitUntilVisible();

		List<WebElement> methodsList = shippingMethodsCondtainer
				.findElements(By.cssSelector("div.col.col-carrier[id]"));
		for (WebElement elementNow : methodsList) {
			String labelNow = elementNow.getText();
			if ((labelNow).contains(shippingMethod)) {
				elementNow.click();
				break;
			}
		}
	}

	public void hitNext() {
		By loader = By.className("loader");
		waitForLoaderToDissapear(loader, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);

		element(nextButton).waitUntilVisible();
		nextButton.click();
	}
}
