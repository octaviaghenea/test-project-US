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
		
		apiEventsAppsSteps.triggerProductChange(6847);
		apiEventsAppsSteps.triggerProductChange(2983);
		apiEventsAppsSteps.triggerProductChange(7232);
		//apiEventsAppsSteps.triggerProductChange(1136);
		apiEventsAppsSteps.triggerProductChange(11070);
		//apiEventsAppsSteps.triggerProductChange(10367);
		apiEventsAppsSteps.triggerProductChange(9136);
		//apiEventsAppsSteps.triggerProductChange(643);
		apiEventsAppsSteps.triggerProductChange(17259);
		apiEventsAppsSteps.triggerProductChange(17871);
		apiEventsAppsSteps.triggerProductChange(1735);
		
		/*apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);
		apiEventsAppsSteps.triggerProductChange(11070);*/
		
		/*apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		apiEventsAppsSteps.triggerProductOptionsChange(10234);
		*/
		}
}
