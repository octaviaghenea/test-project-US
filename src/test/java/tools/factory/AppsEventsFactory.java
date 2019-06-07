package tools.factory;

import tools.entities.AppsEvents;
import tools.entities.Customer;
import tools.entities.CustomerMagento;

public class AppsEventsFactory {

	public static AppsEvents getProductChangeEvent() {

		AppsEvents event = new AppsEvents();
		event.setEvent("E1001");
		event.setPayload("19160");
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
	
	public static AppsEvents getMagentoCustomerChange() {
		
		AppsEvents event = new AppsEvents();
		event.setEvent("E2001");
		event.setPayload("");
		event.setPriority("199");
		return event;
	}
}
