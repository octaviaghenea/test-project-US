package tests.api;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerCreationSteps;
import steps.account.CustomerSteps;
import steps.account.LoginSteps;
import steps.account.MyAccountNavigationSteps;
import steps.api.APICustomerMagentoSteps;
import steps.api.APICustomerOSCSteps;
import steps.api.APIEventsAppsSteps;
import steps.header.HeaderSteps;
import tools.entities.Customer;
import tools.entities.CustomerAddressOSC;
import tools.entities.CustomerMagento;
import tools.entities.CustomerOSC;
import tools.factory.UserFactory;
import tools.models.UserAddressModel;
import tools.models.UserModel;

@RunWith(SerenityRunner.class)

public class API0011CheckCustomerDetailsInOSCTest extends BaseApiTest {

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CustomerSteps customerSteps;
	@Steps
	CustomerCreationSteps customerCreationSteps;
	@Steps
	MyAccountNavigationSteps myAccountNavigationSteps;
	@Steps
	APICustomerMagentoSteps aPICustomerMagentoSteps;
	@Steps
	APICustomerOSCSteps apiCustomerOSCSteps;
	@Steps
	APIEventsAppsSteps apiEvents;

	public UserModel user;
	public UserAddressModel userAddress;
	public String oscID;
	public String magID;
	public UserAddressModel userAdditionalAddress;

	@Before
	public void dataSetup() throws IOException {

		userAddress = UserFactory.getUserAddress();
		userAdditionalAddress = UserFactory.getUserAdditionalAddress();
		user = UserFactory.getUserInstance();
		CustomerMagento cm = aPICustomerMagentoSteps.createMagentoCustomer();
		System.out.println(cm);
		apiEvents.triggerCustomerChange(cm.getId());
		oscID = apiCustomerOSCSteps.getOSCUserIdByEmail(cm.getEmail());
		magID = String.valueOf(cm.getId());
		aPICustomerMagentoSteps.saveUserCredentialsInFile(cm.getEmail(), cm.getPassword());
	}

	@Test
	public void checkCustomerDetailsOSC() throws Exception {

		loginSteps.openMagentoPage();
		headerSteps.selectFromAccount("Log in");
		loginSteps.loginToAccount();

		myAccountNavigationSteps.clickAccountInformation();
		customerSteps.editAcountInformation(user);

		myAccountNavigationSteps.clickAddressBookLink();
		customerSteps.addNewAddress(userAddress);
		
		myAccountNavigationSteps.clickAddressBookLink();
		customerSteps.addAdditionalAddress(userAdditionalAddress);

		Customer customerMagento = aPICustomerMagentoSteps.getMagentoCustomer(magID);
		System.out.println(customerMagento);

		CustomerOSC customerOSC = apiCustomerOSCSteps.getCustomerById(oscID);
		System.out.println(customerOSC);
		List<CustomerAddressOSC> customerAddressOSC = apiCustomerOSCSteps.getCustomerAddressById(oscID);
		System.out.println(customerAddressOSC);

		apiCustomerOSCSteps.verifyCustomerMagentoToOSC(customerMagento, customerOSC);
		apiCustomerOSCSteps.verifyAddressMagentoToOSC(userAddress, customerAddressOSC.get(0));
	}
}
