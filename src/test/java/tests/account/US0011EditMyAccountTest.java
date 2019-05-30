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
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class US0011EditMyAccountTest extends BaseTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerSteps customerSteps;
	@Steps
	MyAccountNavigationSteps myAccountNavigationSteps;

	public UserModel user;

	@Before
	public void dataSetup() {

		user = UserFactory.getUserInstance();
	}

	@Test
	public void editMyAccountTest() {
		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Log in");
		loginSteps.loginToAccount();
		loginSteps.verifyPageTitle(webdriver);
		myAccountNavigationSteps.clickAccountInformation();
		customerSteps.editAcountInformation(user);
	}
}
