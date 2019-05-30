package tests.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerSteps;
import steps.account.LoginSteps;
import steps.account.MyAccountNavigationSteps;
import steps.api.APICustomerMagentoSteps;
import steps.api.APICustomerOSCSteps;
import steps.header.HeaderSteps;
import tools.entities.CustomerOSC;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class API0011CheckCustomerDetailsInOSCTest extends BaseApiTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerSteps customerSteps;
	@Steps
	MyAccountNavigationSteps myAccountNavigationSteps;
	@Steps
	APICustomerOSCSteps APICustomerOSCSteps;
	@Steps
	APICustomerMagentoSteps aPICustomerMagentoSteps;

	String id = "652362";

	public UserModel user;

	@Test
	public void checkCustomerDetailsOSC() {

		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Log in");
		loginSteps.loginToAccount();

		myAccountNavigationSteps.clickAccountInformation();
		customerSteps.editAcountInformation(user);

		CustomerOSC customerOSC = APICustomerOSCSteps.getCustomerById(id);
		System.out.println(customerOSC);
		APICustomerOSCSteps.verifyCustomerMagentoToOSC(user, customerOSC);
	}
}
