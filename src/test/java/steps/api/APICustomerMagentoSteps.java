package steps.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.CustomerMagento;
import tools.factory.CustomerMagentoFactory;
import tools.utils.PropertyFileReader;

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
	public void saveUserCredentialsInFile(String email, String password) throws IOException {
		CustomerMagento cm = new CustomerMagento();
		cm.setEmail(email);
		cm.setPassword(password);
		PropertyFileReader.savePropertyInPropertyFile("test.properties", "TEST", "dssds");
		Map<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("password", password);
		PropertyFileReader.savePropertiesInPropertyFile("test.properties", map);
	}
	
	@Step 
	public String getMagentoCustomer(String customerId) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer x0e41dpde3gynl2pa67w7gg80rv2wsx0");
		return getResource("/V1/customers/" + customerId);
	}
}
