package tools.factory;

import tools.models.UserModel;
import tools.utils.RandomGenerators;

public class UserFactory {

	public static UserModel getUserInstance() {

		UserModel user = new UserModel();
		user.setFirstName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		user.setLastName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		user.setEmail(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA) + "@test.com");
		user.setPassword("Pepsicola123");
		user.setConfirmPassword("Pepsicola123");

		return user;
	}
	
	public static UserModel getUserAddress() {
		
		UserModel address = new UserModel();
		address.setCompanyName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		address.setPhoneNumber(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.NUMERIC));
		address.setStreet(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		address.setCity(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		address.setState("Arizona");
		address.setZipCode(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.NUMERIC));
		
		return address;
	}
}

