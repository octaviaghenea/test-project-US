package tests.api;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APICustomerOSCSteps;

@RunWith(SerenityRunner.class)

public class API0013CheckCustomerOrders extends BaseApiTest {

	@Steps
	APICustomerOSCSteps apiCustomerOSCStepsSteps;

	@Test
	public void checkCustomerOrdersInOSC() {

		apiCustomerOSCStepsSteps.getOrdersByCustomerId("68563");
	}
}
