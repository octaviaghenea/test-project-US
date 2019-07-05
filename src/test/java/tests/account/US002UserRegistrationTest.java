package tests.account;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerCreationSteps;
import steps.account.CustomerSteps;
import steps.account.LoginSteps;
import steps.account.MyAccountNavigationSteps;
import steps.header.HeaderSteps;
import tests.BaseTest;
import tools.factory.UserFactory;
import tools.models.UserAddressModel;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class US002UserRegistrationTest extends BaseTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerCreationSteps newCustomerSteps;
	@Steps
	CustomerSteps customerSteps;
	@Steps
	MyAccountNavigationSteps myAccountNavigationSteps;

	public UserModel user;
	public UserAddressModel address;

	@Before
	public void dataSetup() {
		user = UserFactory.getUserInstance();
		address = UserFactory.getUserAddress();
	}

	@Test
	public void createAccount() {

		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Create account");
		newCustomerSteps.createUser(user);
		// newCustomerSteps.verifyCustomerName(user);
		newCustomerSteps.verifySuccesfullyRegisteredMessage();
		myAccountNavigationSteps.clickAddressBookLink();
		customerSteps.addNewAddress(address);
		
	}
}
