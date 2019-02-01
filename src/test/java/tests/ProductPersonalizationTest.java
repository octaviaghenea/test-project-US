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
		product.setProductSku("PM16260");
		product.setFirstOption("Yes, Plaque +$34.95");
		product.setSecondOption("Hearts +$4.95");
		product.setThirdOption("Script Font");
		product.setFirstPoem("Never Forget +$7.95");
		product.setFirstLine("fdsfds");
		product.setSecondLine("wtdfgdfg");
		product.setThirdLine("dgdlkdjjds dhfgdhf");
		product.setFourthLine("dfdsgdf dgfgdf gdf");
		product.setSecondPoem("Those We Have Held +$14.95");
		/*product.setCroppingNotes(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");*/
	}

	@Test
	public void personalizeProduct() {

		loginSteps.openMagentoPage(baseURL);
		searchSteps.searchProduct(product);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProduct(product);
	}

}
