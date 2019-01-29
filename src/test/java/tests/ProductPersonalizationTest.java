package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.LoginSteps;
import steps.header.SearchSteps;
import steps.product.ProductPersonalizationSteps;
import tools.models.ProductModel;

@RunWith(SerenityRunner.class)

public class ProductPersonalizationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	ProductPersonalizationSteps productPersonalizationSteps;
	@Steps
	SearchSteps searchSteps;

	public String baseURL;
	public String email;
	public String password;
	public String sku;
	public String qty;
	public ProductModel product;

	@Before
	public void dataSetup() {
		baseURL = "https://storefront-internal.perfectmemorials.com";
		email = "octavia.ghenea@test.com";
		password = "Pepsicola123";

		product = new ProductModel();
		product.setProductName("name");
		product.setProductSku("PM10136");
		product.setFirstOption("Script Font +$14.95");
		product.setSecondOption("Peace Dove +$1.95");
		product.setFirstLine("fdsfds");
		product.setSecondLine("wtdfgdfg");
		product.setThirdOption("Purple Embroidered Angel Wings +$14.95");

	}

	@Test
	public void loginToAccount() {

		loginSteps.openMagentoPage(baseURL);
		searchSteps.searchProduct(product);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProduct(product);

	}

}
