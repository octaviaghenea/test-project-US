package steps.account;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Title;
import pages.account.CustomerVerificationPage;
import pages.account.NewCustomerRegistrationPage;
import tools.constants.MessageConstants;
import tools.models.UserModel;

public class CustomerCreationSteps {

	NewCustomerRegistrationPage customerRegistration;
	CustomerVerificationPage customerVerificationPage;

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
		// hitSignUpNewsletter();
		enterEmail(userCreate.getEmail());
		enterPassword(userCreate.getPassword());
		enterPassConfirmation(userCreate.getConfirmPassword());
		hitCreateAccount();
	}
	
	@Title("Create account after order placement")
	@StepGroup
	public void createAccountAfterplaceingOrder(UserModel userCreate) {
		enterPassword(userCreate.getPassword());
		enterPassConfirmation(userCreate.getConfirmPassword());
		hitCreateAccount();
	}

	public void verifyCustomerName(UserModel user) {
		String expectedName = user.getFirstName() + " " + user.getLastName();
		// System.out.println("Expected name is: " + expectedName);
		String actualName = customerVerificationPage.getCustomerName();
		Assert.assertTrue("Customer name not correct Expected: " + expectedName + " Actual: " + actualName,
				expectedName.contentEquals(actualName));
	}

	public void verifySuccesfullyRegisteredMessage() {
		String actualMessage = customerVerificationPage.getThankYouMessage();
		Assert.assertTrue(
				"Thank you message not correct Expected: " + MessageConstants.SUCCESFULLY_REGISTERED_MESSAGE
						+ " Actual: " + actualMessage,
				MessageConstants.SUCCESFULLY_REGISTERED_MESSAGE.contentEquals(actualMessage));
	}

}
