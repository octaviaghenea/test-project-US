package tools.factory;

import tools.entities.AppsEvents;

public class AppsEventsFactory {

	public static AppsEvents getProductChangeEvent() {

		AppsEvents event = new AppsEvents();
		event.setEvent("E1001");
		event.setPayload("19610");
		event.setPriority("199");
		return event;
	}

	public static AppsEvents getCategoryChangeEvent() {

		AppsEvents event = new AppsEvents();
		event.setEvent("E7001");
		event.setPayload("");
		event.setPriority("199");
		return event;
	}

	public static AppsEvents getCustomerChangeEvent() {

		AppsEvents event = new AppsEvents();
		event.setEvent("E3002");
		event.setPayload("");
		event.setPriority("199");
		return event;
	}
}
