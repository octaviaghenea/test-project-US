package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.LoginSteps;
import steps.account.NewCustomerRegistrationSteps;
import steps.header.HeaderSteps;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class UserRegistrationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	NewCustomerRegistrationSteps newCustomerSteps;

	public String baseURL;
	public UserModel userCreate;
	

	@Before
	public void dataSetup() {
		baseURL = "https://storefront-internal.perfectmemorials.com";
		userCreate = new UserModel();
		userCreate.setFirstName("Ota");
		userCreate.setLastName("Ghenea");
		userCreate.setEmail("ota.ghenea@test.com");
		userCreate.setPassword("Pepsicola123");
		userCreate.setConfirmPassword("Pepsicola123");

	}

	@Test
	public void createAccount() {

		loginSteps.openMagentoPage(baseURL);
		headerSteps.selectFromAccount("Register");
		newCustomerSteps.createUser(userCreate);

	}
}
