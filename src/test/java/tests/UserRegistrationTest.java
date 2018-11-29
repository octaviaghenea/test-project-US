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
import steps.NewCustomerRegistrationSteps;

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
	public String email;
	public String password;
	public String firstName;
	public String lastName;
	public String passwordConfirmation;
	

	@Before
	public void dataSetup() {
		baseURL = "https://storefront-internal.perfectmemorials.com";
		email = "octavia.ghenea@gmail.com";
		password = "Pepsicola123";
		firstName = "Octavia";
		lastName = "Ghenea";
		passwordConfirmation = "Pepsicola123";
				
	}

	@Test
	public void loginToAccount() {

		loginSteps.openReporterPage(baseURL);
		headerSteps.clickOnLogin();
//		loginSteps.fillEmailAddress(email);
//		loginSteps.fillPasswoord(password);
//		loginSteps.hitSignInButton();
		loginSteps.hitCreateButton();
		newCustomerSteps.enterFirstName(firstName);
		newCustomerSteps.enterLastName(lastName);
		newCustomerSteps.hitSignUpNewsletter();
		newCustomerSteps.enterEmail(email);
		newCustomerSteps.enterPassword(password);
		newCustomerSteps.enterPassConfirmation(passwordConfirmation);
		newCustomerSteps.hitCreateAccount();

	}
}
