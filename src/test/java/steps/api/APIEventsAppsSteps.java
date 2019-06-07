package steps.api;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.AppsEvents;
import tools.factory.AppsEventsFactory;

public class APIEventsAppsSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public String triggerProductChange() {
		AppsEvents appsRequest = AppsEventsFactory.getProductChangeEvent();
		return createResource(Constants.URL_APPS_EVENTS, appsRequest);
	}

	@Step
	public String triggerCustomerChange(int payload) {
		AppsEvents appsRequest = AppsEventsFactory.getMagentoCustomerChange();
		appsRequest.setPayload(String.valueOf(payload));
		return createResource(Constants.URL_APPS_EVENTS, appsRequest);
	}
}