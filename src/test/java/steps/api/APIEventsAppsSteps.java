package steps.api;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.AppsEvents;
import tools.factory.AppsEventsFactory;

public class APIEventsAppsSteps extends AbstractApiSteps {
	
	private static final long serialVersionUID = 1L;

	@Step
	public AppsEvents triggerProductChange() {
		AppsEvents appsRequest = AppsEventsFactory.getProductChangeEvent();
		AppsEvents aps = createResource(Constants.URL_APPS_EVENTS, appsRequest, AppsEvents.class);
		return aps;
	}
}
