package tests.api;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APIEventsAppsSteps;

@RunWith(SerenityRunner.class)

public class API0014EventsAppsTest extends BaseApiTest {
 
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;
	
	@Test	
	public void triggerAppsEvents() {
		
		//apiEventsAppsSteps.triggerProductChange();
	}
}
