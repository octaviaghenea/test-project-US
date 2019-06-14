package steps.api;

import java.util.List;

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

	public void verifyAddressMagentoToOSC(UserAddressModel magentoAddress, List<CustomerAddressOSC> customerAddressOSC) {
		System.out.println("magento street is: " + magentoAddress.getStreet()+ " magento City is: "
				+ magentoAddress.getCity());
		System.out.println("osc street is: " + ((CustomerAddressOSC) customerAddressOSC).getStreet_address()+ " osc City is: "
				+ ((CustomerAddressOSC) customerAddressOSC).getCity());
		
		Assert.assertTrue("Street address doesn't match: ", magentoAddress.getStreet().contentEquals(((CustomerAddressOSC) customerAddressOSC).getStreet_address()));
		Assert.assertTrue("City names don't match: ", magentoAddress.getCity().contentEquals(((CustomerAddressOSC) customerAddressOSC).getCity()));
	}
	
	@Step
	public String getOSCUserIdByEmail(String email) {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		CustomerCheckOSC oscCustomerCheck = new CustomerCheckOSC();
		oscCustomerCheck.setEmail(email);
		return createResource("customers/check", oscCustomerCheck);
	}

	@Step
	public List<CustomerAddressOSC> getCustomerAddressById(String customer_id) throws Exception {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		return getResources("/customers/" + customer_id + "/addresses", CustomerAddressOSC.class);
	}
}
