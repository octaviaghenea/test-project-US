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
import tools.factory.ProductFactory;
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

	public ProductModel product;

	@Before
	public void dataSetup() {
		product = ProductFactory.getProductInstance();
	}

	@Test
	public void personalizeProduct() {

		loginSteps.openMagentoPage();
		searchSteps.searchProduct(product);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProduct(product);
	}

}
