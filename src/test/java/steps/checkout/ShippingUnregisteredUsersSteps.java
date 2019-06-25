package steps.checkout;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.checkout.ShippingUnregisteredUsersPage;
import tools.models.ShippingDetailsModel;

public class ShippingUnregisteredUsersSteps {

	ShippingUnregisteredUsersPage checkoutUregisteredUsersPage;

	@StepGroup
	public void enterContactAndShippingInformation(ShippingDetailsModel contact) {
		enterEmail(contact.getEmail());
		enterFirstName(contact.getFirstName());
		enterLastName(contact.getLastName());
		enterCompany(contact.getCompanyName());
		enterStreetAddress(contact.getCompanyName());
		enterCity(contact.getCity());
		selectState(contact.getState());
		enterZipCode(contact.getZipCode());
		enterPhoneNumber(contact.getPhoneNumber());
		selectShippingMethod(contact.getShippingMethod());
		hitNextButton();
	}

	@Step
	public void enterEmail(String email) {
		checkoutUregisteredUsersPage.enterEmail(email);
	}

	@Step
	public void enterFirstName(String firstname) {
		checkoutUregisteredUsersPage.enterFirstName(firstname);
	}

	@Step
	public void enterLastName(String lastname) {
		checkoutUregisteredUsersPage.enterLastName(lastname);
	}

	@Step
	public void enterCompany(String company) {
		checkoutUregisteredUsersPage.enterCompanyName(company);
	}

	@Step
	public void enterStreetAddress(String street) {
		checkoutUregisteredUsersPage.enterStreetAddress(street);
	}

	@Step
	public void enterCity(String city) {
		checkoutUregisteredUsersPage.enterCityName(city);
	}

	@Step
	public void selectState(String state) {
		checkoutUregisteredUsersPage.selectState(state);
	}

	@Step
	public void enterZipCode(String zipcode) {
		checkoutUregisteredUsersPage.enterZipCode(zipcode);
	}

	@Step
	public void enterPhoneNumber(String phonenumber) {
		checkoutUregisteredUsersPage.enterPhoneNumber(phonenumber);
	}

	@Step
	public void selectShippingMethod(String method) {
		checkoutUregisteredUsersPage.selectShippingMethod(method);
	}
	
	@Step
	public void hitNextButton() {
		checkoutUregisteredUsersPage.hitNext();
	}
}
