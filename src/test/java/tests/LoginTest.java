package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.LoginSteps;
import steps.header.HeaderSteps;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;

	public String baseURL;
	public UserModel userLogin;

	@Before
	public void dataSetup() {
		baseURL = "https://storefront-internal.perfectmemorials.com";
		userLogin = new UserModel();
		userLogin.setEmail("octavia.ghenea@gmail.com");
		userLogin.setPassword("Pepsicola123");
	}

	@Test
	public void loginToAccount(){
		loginSteps.openMagentoPage(baseURL);
		headerSteps.selectFromAccount("Login");
		loginSteps.loginToAccount(userLogin);

	}

}
