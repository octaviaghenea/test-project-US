package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerSteps;
import steps.account.LoginSteps;
import steps.header.HeaderSteps;
import tools.factory.UserFactory;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerSteps customerSteps;

	public UserModel user;

	@Before
	public void dataSetup() {
		user = UserFactory.getUserInstance();
	}

	@Test
	public void loginToAccount() {
		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Login");
		loginSteps.loginToAccount(user);
		customerSteps.verifyCustomerName(user);

	}

}
