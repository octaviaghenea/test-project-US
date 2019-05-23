package tests.api;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APIEventsAppsSteps;

@RunWith(SerenityRunner.class)

public class APIEventsAppsTest {
 
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;
	
	@Test	
	public void triggerAppsEvents() {
		
		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8080");
		
		apiEventsAppsSteps.triggerProductChange();
	}
}
