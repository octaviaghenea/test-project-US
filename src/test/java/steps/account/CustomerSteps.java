package steps.account;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.account.AccountInformationPage;
import pages.account.AddressBookPage;
import tools.models.UserAddressModel;
import tools.models.UserModel;

public class CustomerSteps {

	AccountInformationPage accountInformationPage;
	AddressBookPage addressBookPage;

	@StepGroup
	public void editAcountInformation(UserModel userEdit) {
		editUserFirstName(userEdit.getFirstName());
		editUserLastName(userEdit.getLastName());
		hitSaveAccount();
	}

	@StepGroup
	public void addNewAddress(UserAddressModel userAddress) {
		enterCompanyName(userAddress.getCompanyName());
		enterPhoneNumber(userAddress.getPhoneNumber());
		enterStreetAddress(userAddress.getStreet());
		enterCityName(userAddress.getCity());
		selectState(userAddress.getState());
		enterZipCode(userAddress.getZipCode());
		hitSaveAddress();
	}
	
	@StepGroup
	public void addAdditionalAddress(UserAddressModel userAddress) {
		clickAddNewAddressButton();
		enterCompanyName(userAddress.getCompanyName());
		enterPhoneNumber(userAddress.getPhoneNumber());
		enterStreetAddress(userAddress.getStreet());
		enterCityName(userAddress.getCity());
		selectState(userAddress.getState());
		enterZipCode(userAddress.getZipCode());
		selectBillingCheckbox();
		hitSaveAddress();
	}

	@Step
	public void editUserFirstName(String firstname) {
		accountInformationPage.editUserFirstName(firstname);
	}

	@Step
	public void editUserLastName(String lastname) {
		accountInformationPage.editUserLastName(lastname);
	}

	@Step
	public void hitSaveAccount() {
		accountInformationPage.hitSaveButton();
	}

	@Step
	public void enterCompanyName(String company) {
		addressBookPage.enterCompanyName(company);
	}

	@Step
	public void enterPhoneNumber(String phoneNumber) {
		addressBookPage.enterPhoneNumber(phoneNumber);
	}

	@Step
	public void enterStreetAddress(String address) {
		addressBookPage.enterAddress(address);
	}

	@Step
	public void enterCityName(String city) {
		addressBookPage.enterCityName(city);
	}

	@Step
	public void selectState(String state) {
		addressBookPage.selectState(state);
	}

	@Step
	public void enterZipCode(String zipCode) {
		addressBookPage.enterZipCode(zipCode);
	}

	@Step
	public void selectBillingCheckbox() {
		addressBookPage.selectBillingCheckbox();
	}

	public void selectShippingCheckbox() {
		addressBookPage.selectShippingCheckbox();
	}

	@Step
	public void hitSaveAddress() {
		addressBookPage.hitSaveButton();
	}
	
	@Step
	public void clickAddNewAddressButton() {
		addressBookPage.clickAdditionalAddressButton();
	}
}
