package steps.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.Customer;
import tools.entities.CustomerAddressOSC;
import tools.entities.CustomerCheckOSC;
import tools.entities.CustomerOSC;
import tools.models.UserAddressModel;

public class APICustomerOSCSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public CustomerOSC getCustomerById(String customerId) {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		return getResource("/customers/" + customerId, CustomerOSC.class);
	}

	public void verifyCustomerMagentoToOSC(Customer magentoUser, CustomerOSC oscUser) {

		System.out.println("magento firstname is: " + magentoUser.getFirstname() + " magento Lastname is: "
				+ magentoUser.getLastname());
		System.out
				.println("OSC firstname is: " + oscUser.getFirstname() + " OSC lastname is: " + oscUser.getLastname());
		Assert.assertTrue("FirstName doesn't match!!",
				magentoUser.getFirstname().contentEquals(oscUser.getFirstname()));
		Assert.assertTrue("LastName doesn't match!!", magentoUser.getLastname().contentEquals(oscUser.getLastname()));
	}

	@Step
	public String getOSCUserIdByEmail(String email) {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		CustomerCheckOSC oscCustomerCheck = new CustomerCheckOSC();
		oscCustomerCheck.setEmail(email);
		return createResource("customers/check", oscCustomerCheck);
	}

	@Step
	public List<CustomerAddressOSC> getCustomerAddressById(String customer_id) {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		CustomerAddressOSC[] addressArray = getResource("/customers/" + customer_id + "/addresses",
				CustomerAddressOSC[].class);
		return Arrays.asList(addressArray);
	}

	public void verifyAddressMagentoToOSC(UserAddressModel magentoAddress, CustomerAddressOSC customerAddressOSC) {
		System.out.println("Magento street is: " + magentoAddress.getStreet() + " Magento City is: "
				+ magentoAddress.getCity() + "Magento zipcode is: " + magentoAddress.getZipCode());
		System.out.println("Osc street is: " + customerAddressOSC.getStreet_address() + " Osc City is: "
				+ customerAddressOSC.getCity() + " Osc zipcode is: " + customerAddressOSC.getPostcode());

		Assert.assertTrue("Street address doesn't match: ", magentoAddress.getStreet()
				.contentEquals(((CustomerAddressOSC) customerAddressOSC).getStreet_address()));
		Assert.assertTrue("City names don't match: ",
				magentoAddress.getCity().contentEquals(((CustomerAddressOSC) customerAddressOSC).getCity()));
		Assert.assertTrue("Zip codes don't match: ",
				magentoAddress.getZipCode().contentEquals(((CustomerAddressOSC) customerAddressOSC).getPostcode()));
	}

	@Step
	public void getOrdersById(String customerID) {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		Map<String, String> parametersMap = new HashMap<>();
		parametersMap.put("page", "1");
		parametersMap.put("limit", "10");
		parametersMap.put("order", "purchased_at");
		parametersMap.put("dir", "desc");
		getResource("/customers/" + customerID + "/orders", "[]", parametersMap);
	}
}
