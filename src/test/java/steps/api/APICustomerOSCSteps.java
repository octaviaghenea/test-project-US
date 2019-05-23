package steps.api;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.CustomerOSC;
import tools.models.UserModel;

public class APICustomerOSCSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public CustomerOSC getCustomerById(String customerId) {
		AbstractApiSteps.URL = Constants.URL_OSC_CUSTOMER;
		return getResource("/customers/" + customerId, CustomerOSC.class);
	}

	public void verifyCustomerMagentoToOSC(UserModel magentoUser, CustomerOSC oscUser) {

		System.out.println("magento firsname is: " + magentoUser.getFirstName() + " magento Lastname is: " + magentoUser.getLastName());
		System.out.println("OSC firstname is: " + oscUser.getFirstname() + " OSC lastname is: " + oscUser.getLastname());
		Assert.assertTrue("FirstName doesn't match!!",
				magentoUser.getFirstName().contentEquals(oscUser.getFirstname()));
		Assert.assertTrue("LastName doesn't match!!", magentoUser.getLastName().contentEquals(oscUser.getLastname()));
	}
}
