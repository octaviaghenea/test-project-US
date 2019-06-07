package tools.factory;

import tools.entities.Customer;
import tools.entities.CustomerMagento;
import tools.utils.RandomGenerators;

public class CustomerMagentoFactory {
	
	public static CustomerMagento getCustomerMagentoInstance(){
		
		Customer customer = new Customer();
		customer.setFirstname(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		customer.setLastname(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		customer.setEmail(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA) + "@test.com");
		
		CustomerMagento customerMagento = new CustomerMagento();
		customerMagento.setCustomer(customer);
		customerMagento.setPassword("Pepsi123");
		
		return customerMagento;
	}

}
