package tools.factory;

import tools.models.ReviewAndPaymentsModel;
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
		shipping.setShippingMethod("One-Day Delivery");

		return shipping;
	}

	public static ReviewAndPaymentsModel getPaymentMethodDetails() {

		ReviewAndPaymentsModel payment = new ReviewAndPaymentsModel();
		
		payment.setPaymentMethod("Credit Card (Authorize.Net)");
		payment.setCreditCardNumber("4111111111111111");
		payment.setExpirationDate("04 - April");
		payment.setExpirationYear("2021");
		payment.setCcvnumber("111");
		payment.setComment(RandomGenerators.generateRandomString(50, RandomGenerators.Mode.ALPHA));

		return payment;
	}

}
