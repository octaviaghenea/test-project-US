package steps.account;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.account.LoginPage;
import tools.constants.UrlConstants;
import tools.models.UserModel;

public class LoginSteps {

	LoginPage loginPage;

	@Step
	public void openMagentoPage() {
		loginPage.getDriver().get(UrlConstants.BASE_URL);
	}
	
	@Step
	public void openMUrl(String url) {
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

	@StepGroup
	public void loginToAccount(UserModel userModel) {
		fillEmailAddress(userModel.getEmail());
		fillPasswoord(userModel.getPassword());
		hitSignInButton();

	}
}
