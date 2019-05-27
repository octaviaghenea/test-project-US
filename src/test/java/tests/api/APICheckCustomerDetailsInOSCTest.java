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
import net.thucydides.core.annotations.Managed;
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

public class APICheckCustomerDetailsInOSCTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

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

	String userName = "";
	String password = "";
	String id = "";

	public UserModel user;

	@Before
	public void dataSetup() {

		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("src/test/resources/properties/login.properties");
			prop.load(input);

			userName = prop.getProperty("username");
			password = prop.getProperty("password");
			id = prop.getProperty("id");

			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("id"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Test
	public void checkCustomerDetailsOSC() {

		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8080");

		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Log in");
		loginSteps.loginToAccount(userName, password);
		
		myAccountNavigationSteps.clickAccountInformation();
		customerSteps.editAcountInformation(user);

		CustomerOSC customerOSC = APICustomerOSCSteps.getCustomerById(id);
		APICustomerOSCSteps.verifyCustomerMagentoToOSC(user, customerOSC);
	}
}
