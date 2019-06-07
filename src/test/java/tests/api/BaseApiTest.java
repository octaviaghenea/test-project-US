package tests.api;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;

public class BaseApiTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Before
	public void dataMonitor() {

		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8080");

	}
}
