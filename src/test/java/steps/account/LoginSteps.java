package steps.account;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.account.LoginPage;
import tools.constants.MessageConstants;
import tools.constants.Constants;

public class LoginSteps {

	LoginPage loginPage;

	@Step
	public void openMagentoPage() {
		loginPage.getDriver().get(Constants.BASE_URL);
	}

	@Step
	public void fillEmailAddress(String email) {
		loginPage.fillEmailInput(email);
	}

	@Step
	public void fillPasswoord(String pass) {
		loginPage.fillPasswordInput(pass);
	}

	@Step
	public void hitSignInButton() {
		loginPage.hitSignIn();
	}

	@StepGroup
	public void loginToAccount(String email, String password) {
		fillEmailAddress(email);
		fillPasswoord(password);
		hitSignInButton();
	}

	public void verifyPageTitle(WebDriver webdriver) {
		String actualTitle = webdriver.getTitle();
		String expectedTitle = "My Account";
		System.out.println("Actual title: " + actualTitle);
		Assert.assertTrue("Page name not correct: " + expectedTitle + " Actual page title: " + actualTitle,
				expectedTitle.contentEquals(actualTitle));
	}

	public void verifyLoginErrorMessage() {
		String actualMessage = loginPage.getLoginErrorMessage();
		Assert.assertTrue(
				"Email or Password not correct: " + MessageConstants.LOGIN_ERROR_MESSAGE + "Actual: " + actualMessage,
				MessageConstants.LOGIN_ERROR_MESSAGE.contentEquals(actualMessage));
	}
}
