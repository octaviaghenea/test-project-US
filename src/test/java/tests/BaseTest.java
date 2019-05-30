package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import tools.factory.UserFactory;
import tools.models.UserModel;

public class BaseTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Before
	public void dataSetup() {

	}
}
