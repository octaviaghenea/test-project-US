package steps.account;

import pages.account.MyAccountNavigationPage;

public class MyAccountNavigationSteps {

	MyAccountNavigationPage myAccountNavigationPage;

	public void clickAccountInformation() {
		myAccountNavigationPage.clickAccountInformation();
	}
	
	public void clickAddressBookLink() {
		myAccountNavigationPage.clickAddressBook();
	}
}
