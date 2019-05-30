package tests.account;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerSteps;
import steps.account.LoginSteps;
import steps.account.MyAccountNavigationSteps;
import steps.header.HeaderSteps;
import tests.BaseTest;
import tools.factory.UserFactory;
import tools.models.UserAddressModel;

@RunWith(SerenityRunner.class)

public class US0011AddNewAddressTest extends BaseTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerSteps customerSteps;
	@Steps
	MyAccountNavigationSteps myAccountNavigationSteps;

	public UserAddressModel address;

	@Before
	public void dataSetup() {

		address = UserFactory.getUserAddress();
	}

	@Test
	public void addNewAddressTest() {
		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Log in");
		loginSteps.loginToAccount();
		loginSteps.verifyPageTitle(webdriver);
		myAccountNavigationSteps.clickAddressBookLink();
		customerSteps.addNewAddress(address);
	}
}
