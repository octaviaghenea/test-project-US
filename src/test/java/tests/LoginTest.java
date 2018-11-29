package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.HeaderSteps;
import steps.LoginSteps;
import steps.ProductListSteps;

@RunWith(SerenityRunner.class)

public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	ProductListSteps productListSteps;

	public String baseURL;
	public String email;
	public String password;
	public String sku;
	
	
	@Before
	public void dataSetup() {
		baseURL = "https://storefront-internal.perfectmemorials.com";
		email = "octavia.ghenea@gmail.com";
		password = "Pepsicola123";
		sku = "PM6049";
	}
	
	@Test
	public void loginToAccount() {
		
		loginSteps.openReporterPage(baseURL);
		//headerSteps.searchProduct(sku);
		productListSteps.clickOnProductName();
		/*headerSteps.clickOnLogin();
		loginSteps.fillEmailAddress(email);
		loginSteps.fillPasswoord(password);
		loginSteps.hitSignInButton();*/
		
	}

}
