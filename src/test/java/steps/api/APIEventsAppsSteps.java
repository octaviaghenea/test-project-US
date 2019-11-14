package steps.api;

import java.sql.Array;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.AppsEvents;
import tools.factory.AppsEventsFactory;

public class APIEventsAppsSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public String triggerProductChange(int payload) {
		AppsEvents appsRequest = AppsEventsFactory.getProductChangeEvent();
		appsRequest.setPayload(String.valueOf(payload));
		return createResource(Constants.URL_APPS_EVENTS, appsRequest);
	}
	
	@Step
	public String triggerProductOptionsChange(int payload) {
		AppsEvents appsRequest = AppsEventsFactory.getProductOptionsChangeEvent();
		appsRequest.setPayload("{\"id\":" +  String.valueOf(payload) + "}");
		return createResource(Constants.URL_APPS_EVENTS, appsRequest);
	}

	@Step
	public String triggerCustomerChange(int payload) {
		AppsEvents appsRequest = AppsEventsFactory.getMagentoCustomerChangeEvent();
		appsRequest.setPayload(String.valueOf(payload));
		return createResource(Constants.URL_APPS_EVENTS, appsRequest);
	}
}