package tests.api;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APICustomerMagentoSteps;
import steps.api.APICustomerOSCSteps;
import steps.api.APIEventsAppsSteps;
import tools.entities.CustomerMagento;

@RunWith(SerenityRunner.class)

public class API0011CreateMagentoCustomerTest extends BaseApiTest {

	@Steps
	APICustomerMagentoSteps aPICustomerMagentoSteps;
	@Steps
	APICustomerOSCSteps apiCustomerOSCStepsSteps;
	@Steps
	APIEventsAppsSteps apiEvents;


	@Test
	public void createMagentoCustomer() {
	
		/*CustomerMagento cm = aPICustomerMagentoSteps.createMagentoCustomer();
		System.out.println(cm);*/
		System.out.println(aPICustomerMagentoSteps.getMagentoCustomer("4"));
		/*apiEvents.triggerCustomerChange(cm.getId());
		String oscID = apiCustomerOSCStepsSteps.getOSCUserIdByEmail(cm.getEmail());
		System.out.println(oscID);*/
	}
}
