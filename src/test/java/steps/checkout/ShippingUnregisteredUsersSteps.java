package steps.checkout;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.checkout.ShippingUnregisteredUsersPage;
import tools.models.ShippingDetailsModel;

public class ShippingUnregisteredUsersSteps {

	ShippingUnregisteredUsersPage shippingUnregisteredUsersPage;

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
		shippingUnregisteredUsersPage.enterEmail(email);
	}

	@Step
	public void enterFirstName(String firstname) {
		shippingUnregisteredUsersPage.enterFirstName(firstname);
	}

	@Step
	public void enterLastName(String lastname) {
		shippingUnregisteredUsersPage.enterLastName(lastname);
	}

	@Step
	public void enterCompany(String company) {
		shippingUnregisteredUsersPage.enterCompanyName(company);
	}

	@Step
	public void enterStreetAddress(String street) {
		shippingUnregisteredUsersPage.enterStreetAddress(street);
	}

	@Step
	public void enterCity(String city) {
		shippingUnregisteredUsersPage.enterCityName(city);
	}

	@Step
	public void selectState(String state) {
		shippingUnregisteredUsersPage.selectState(state);
	}

	@Step
	public void enterZipCode(String zipcode) {
		shippingUnregisteredUsersPage.enterZipCode(zipcode);
	}

	@Step
	public void enterPhoneNumber(String phonenumber) {
		shippingUnregisteredUsersPage.enterPhoneNumber(phonenumber);
	}

	@Step
	public void selectShippingMethod(String method) {
		shippingUnregisteredUsersPage.selectShippingMethod(method);
	}

	@Step
	public void hitNextButton() {
		shippingUnregisteredUsersPage.hitNext();
	}
}
