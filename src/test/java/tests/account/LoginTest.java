package tests.account;

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
import steps.header.HeaderSteps;

@RunWith(SerenityRunner.class)

public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerSteps customerSteps;

	String userName = "";
	String password = "";

	@Before
	public void dataSetup() {

		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("src/test/resources/properties/login.properties");
			prop.load(input);

			userName = prop.getProperty("username");
			password = prop.getProperty("password");

			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));

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
	public void loginToAccount() {
		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Login");
		loginSteps.loginToAccount(userName, password);
		loginSteps.verifyPageTitle(webdriver);
	}
}
