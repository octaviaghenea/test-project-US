package tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.HeaderSteps;
import steps.LoginSteps;
import steps.NewCustomerRegistrationSteps;
import steps.ProductDetailsSteps;
import steps.ProductListSteps;
import steps.ProductPersonalizationSteps;
import tools.models.ProductModel;
import tools.models.UserCreateModel;

@RunWith(SerenityRunner.class)

public class HappyFlowTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	HeaderSteps headerSteps;
	@Steps
	ProductListSteps productListSteps;
	@Steps
	ProductDetailsSteps productDetailsSteps;
	@Steps
	ProductPersonalizationSteps productPersonalizationSteps;
	@Steps
	NewCustomerRegistrationSteps newCustomerSteps;


	public String baseURL;
	public String email;
	public String password;
	public String sku;
	public String qty;
	public ProductModel product;
	public UserCreateModel userCreate;

	@Before
	public void dataSetup() {
		baseURL = "https://storefront-internal.perfectmemorials.com";
		email = "octavia.ghenea@test.com";
		password = "Pepsicola123";
		// sku = "PM10136";
		qty = "5";
		
		product = new ProductModel();
		product.setProductName("name");
		product.setProductSku("PM10136");
		product.setFirstOption("Script Font +$14.95");
		product.setSecondOption("Peace Dove +$1.95");
		product.setFirstLine("fdsfds");
		product.setSecondLine("wtdfgdfg");
		product.setThirdOption("Purple Embroidered Angel Wings +$14.95");
		
		userCreate = new UserCreateModel();
		userCreate.setFirstName("Ota");
		userCreate.setLastName("Ghenea");
		userCreate.setEmail("ota.ghenea@test.com");
		userCreate.setPassword("Pepsicola123");
		userCreate.setConfirmPassword("Pepsicola123");

	}

	@Test
	public void loginToAccount() {

		loginSteps.openMagentoPage(baseURL);
		//headerSteps.clickFreeShipping();
		//headerSteps.selectCmsPage("Blog");
		headerSteps.selectFromAccount("Register");
		
		//loginSteps.fillEmailAddress(email);
		//loginSteps.fillPasswoord(password);
		//loginSteps.hitSignInButton();
//		headerSteps.searchProduct(product);
//		productListSteps.clickOnProductName();
		//productPersonalizationSteps.personalizeProduct(product);
//		productDetailsSteps.setQuantity(qty);
//		productDetailsSteps.addToCard();
		newCustomerSteps.createUser(userCreate);

	}

}
