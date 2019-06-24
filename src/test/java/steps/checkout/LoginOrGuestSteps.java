package steps.checkout;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.checkout.LoginOrGuestPage;
import tools.constants.EnvironmentConstants;

public class LoginOrGuestSteps {
	
	LoginOrGuestPage loginOrGuestpage;
	
	
	@StepGroup
	public void checkoutAsCustomer() {
	fillEmailAddress(EnvironmentConstants.REGULAR_USER);
	fillPasswoord(EnvironmentConstants.PASSWORD);
	hitLoginButton();
} 
	@Step
	public void continueAsGuest() {
		loginOrGuestpage.continueAsGuest();
	}

	@Step
	public void fillEmailAddress(String email) {
		loginOrGuestpage.enterEmail(email);
	}
	@Step
	public void fillPasswoord(String password) {
		loginOrGuestpage.enterPassword(password);
	}
	
	@Step
	public void hitLoginButton() {
		loginOrGuestpage.hitLogInButton();
	}
} 

