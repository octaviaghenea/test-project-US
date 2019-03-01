package tests.product;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.LoginSteps;
import steps.header.SearchSteps;
import steps.product.ProductDetailsSteps;
import steps.product.ProductPersonalizationSteps;
import tools.factory.ProductFactory;
import tools.models.ProductPersonalizationModel;

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
	@Steps
	ProductDetailsSteps productDetailsSteps;

	public ProductPersonalizationModel product;

	@Before
	public void dataSetup() {
		// product = ProductFactory.getProductInstanceWithImage();
		product = ProductFactory.getProductInstanceWithoutImage();
	}

	@Test
	public void personalizeProduct() {

		loginSteps.openMagentoPage();
		searchSteps.searchProduct(product);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProduct(product);
		productDetailsSteps.verifyUnitPrice(product);
		// productPersonalizationSteps.personalizeProductWithPhoto(product);
		// productDetailsSteps.setQuantity("2");
		// productDetailsSteps.addToCard();
		// productDetailsSteps.verifySuccessfullyAddedMessage();

	}
}
