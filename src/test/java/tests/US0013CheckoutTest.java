package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.CustomerCreationSteps;
import steps.account.LoginSteps;
import steps.checkout.CartSteps;
import steps.checkout.ShippingUnregisteredUsersSteps;
import steps.checkout.LoginOrGuestSteps;
import steps.checkout.OrderSuccessSteps;
import steps.checkout.ReviewAndPaymentsSteps;
import steps.header.HeaderSteps;
import steps.header.SearchSteps;
import steps.product.ProductDetailsSteps;
import steps.product.ProductPersonalizationSteps;
import tools.constants.OptionsConstants;
import tools.factory.CheckoutFactory;
import tools.factory.ProductFactory;
import tools.factory.UserFactory;
import tools.models.CartModel;
import tools.models.ReviewAndPaymentsModel;
import tools.models.ShippingDetailsModel;
import tools.models.UserModel;
import tools.utils.StringUtils;

@RunWith(SerenityRunner.class)

public class US0013CheckoutTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	ProductPersonalizationSteps productPersonalizationSteps;
	@Steps
	SearchSteps searchSteps;
	@Steps
	ProductDetailsSteps productDetailsSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	CartSteps cartSteps;
	@Steps
	ShippingUnregisteredUsersSteps shippingUnregisteredUsersSteps;
	@Steps
	LoginOrGuestSteps loginOrGuestSteps;
	@Steps
	ReviewAndPaymentsSteps reviewAndPaymentsSteps;
	@Steps
	OrderSuccessSteps orderSuccessSteps;
	@Steps 
	CustomerCreationSteps customerCreationSteps;

	public CartModel product1;
	public CartModel product2;
	public ShippingDetailsModel contact;
	public ReviewAndPaymentsModel payment;
	public UserModel user;

	List<CartModel> expectedProductList = new ArrayList<CartModel>();

	@Before
	public void dataSetup() {

		product1 = ProductFactory.getProductInstanceWithoutImage();
		expectedProductList.add(product1);

		product2 = ProductFactory.getProductInstanceWithoutImage();
		product2.setItemQty("2");
		product2.setBackPoemOption("No Thanks");
		product2.getOptions().put(OptionsConstants.CHOOSE_BACK_POEM,
				StringUtils.cleanStringToNumberOrZeroDefault("No Thanks"));
		ProductFactory.updateInstance(product2);

		expectedProductList.add(product2);

		System.out.println("Expected");
		for (CartModel cartModel : expectedProductList) {
			System.out.println("---------------");
			System.out.println(cartModel);
		}

		contact = CheckoutFactory.getShippingDetails();
		user = UserFactory.getUserInstance();
		payment = CheckoutFactory.getPaymentMethodDetails();
		
	}

	@Test
	public void addToCart() {

		loginSteps.openMagentoPage();

		searchSteps.searchProduct(product1);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProductWithoutPhoto(product1);
		productDetailsSteps.verifyUnitPrice(product1);
		productDetailsSteps.addToCard();
		
		loginSteps.openMagentoPage();

		searchSteps.searchProduct(product2);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProductWithoutPhoto(product2);
		productDetailsSteps.verifyUnitPrice(product2);
		productDetailsSteps.addToCard();

		headerSteps.goToMiniCart();
		cartSteps.goToCart();
		cartSteps.verifyProduct();
		cartSteps.proceedToCheckout();	
		

		loginOrGuestSteps.continueAsGuest();
		shippingUnregisteredUsersSteps.enterContactAndShippingInformation(contact);
		reviewAndPaymentsSteps.enterPaymentInformation(payment);
		orderSuccessSteps.verifyThankYouMessage();
		orderSuccessSteps.createAnAccount();
		customerCreationSteps.createAccountAfterPlacingOrder(user);		
	}
}
