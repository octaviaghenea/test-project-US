package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps {

	LoginPage loginPage;
	
	@Step
	public void openReporterPage(String url) {
		loginPage.getDriver().get(url);
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
	
	@Step
	public void hitCreateButton() {
		loginPage.hitCreateAccount();
	}
	
	
}
