package tests.account;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.account.LoginSteps;
import steps.header.HeaderSteps;
import tests.BaseTest;

@RunWith(SerenityRunner.class)

public class US0011LoginTest extends BaseTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;

	@Test
	public void loginToAccount() {
		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Log in");
		loginSteps.loginToAccount();
		loginSteps.verifyPageTitle(webdriver);
	}
}
