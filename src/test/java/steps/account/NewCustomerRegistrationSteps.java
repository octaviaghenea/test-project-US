package steps.account;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.account.NewCustomerRegistrationPage;
import tools.models.UserModel;

public class NewCustomerRegistrationSteps {

	NewCustomerRegistrationPage customerRegistration;

	@Step
	public void enterFirstName(String firstname) {
		customerRegistration.enterFirstName(firstname);
	}

	@Step
	public void enterLastName(String lastName) {
		customerRegistration.enterLastName(lastName);
	}

	@Step
	public void hitSignUpNewsletter() {
		customerRegistration.hitNewsletterSignUp();
	}

	@Step
	public void enterEmail(String email) {
		customerRegistration.enterEmailAddress(email);
	}

	@Step
	public void enterPassword(String pass) {
		customerRegistration.enterPassword(pass);
	}

	@Step
	public void enterPassConfirmation(String confirm) {
		customerRegistration.enterPassConfirmation(confirm);
	}
	
	@Step
	public void hitCreateAccount() {
		customerRegistration.hitCreate();
	}
	
	@StepGroup
	public void createUser(UserModel userCreate) {
		enterFirstName(userCreate.getFirstName());
		enterLastName(userCreate.getLastName());
		hitSignUpNewsletter();
		enterEmail(userCreate.getEmail());
		enterPassword(userCreate.getPassword());
		enterPassConfirmation(userCreate.getConfirmPassword());
		hitCreateAccount();
	}
	

}
