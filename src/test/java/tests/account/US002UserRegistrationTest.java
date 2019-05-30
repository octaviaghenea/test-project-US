package tests.account;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerCreationSteps;
import steps.account.LoginSteps;
import steps.header.HeaderSteps;
import tests.BaseTest;
import tools.factory.UserFactory;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class US002UserRegistrationTest extends BaseTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerCreationSteps newCustomerSteps;

	public UserModel user;

	@Before
	public void dataSetup() {
		user = UserFactory.getUserInstance();
	}

	@Test
	public void createAccount() {

		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Register");
		newCustomerSteps.createUser(user);
		// newCustomerSteps.verifyCustomerName(user);
		newCustomerSteps.verifySuccesfullyRegisteredMessage();
	}
}
