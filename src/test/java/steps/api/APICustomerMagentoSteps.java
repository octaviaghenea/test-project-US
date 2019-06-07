package steps.api;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.CustomerMagento;
import tools.factory.CustomerMagentoFactory;

public class APICustomerMagentoSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public CustomerMagento createMagentoCustomer() {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		CustomerMagento customerRequest = CustomerMagentoFactory.getCustomerMagentoInstance();
		CustomerMagento cm = createResource("/V1/customers/", customerRequest, CustomerMagento.class);
		System.out.println(cm);
		return cm;
	}

	@Step
	public String getMagentoCustomer(String customerId) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer x0e41dpde3gynl2pa67w7gg80rv2wsx0");
		return getResource("/V1/customers/" + customerId);
	}
}
