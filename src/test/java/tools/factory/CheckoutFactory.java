package tools.factory;

import tools.models.ShippingDetailsModel;
import tools.utils.RandomGenerators;

public class CheckoutFactory {

	public static ShippingDetailsModel getShippingDetails() {

		ShippingDetailsModel shipping = new ShippingDetailsModel();
		shipping.setEmail(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA) + "@test.com");
		shipping.setFirstName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		shipping.setLastName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		shipping.setCompanyName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		shipping.setStreet(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		shipping.setCity(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		shipping.setState("California");
		shipping.setZipCode(RandomGenerators.generateRandomString(4, RandomGenerators.Mode.NUMERIC));
		shipping.setPhoneNumber(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.NUMERIC));
		shipping.setShippingMethod("ko_unique_6");
		
		return shipping;
	}

}
