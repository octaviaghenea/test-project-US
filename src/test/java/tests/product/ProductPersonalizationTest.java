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
import steps.product.ProductPersonalizationSteps;
import tools.factory.ProductFactory;
import tools.models.ProductPersonalizationModel;
import tools.models.ProductPersonalizationWithPhotoModel;

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

	public ProductPersonalizationWithPhotoModel product;
	public ProductPersonalizationModel product2;

	@Before
	public void dataSetup() {
		product = ProductFactory.getProductInstanceWithImage();
		product2 = ProductFactory.getProductInstanceWithoutImage();
	}

	@Test
	public void personalizeProduct() {

		loginSteps.openMagentoPage();
		searchSteps.searchProduct(product2);
		searchSteps.clickSearchedItem();
		productPersonalizationSteps.personalizeProduct(product2);
		//productPersonalizationSteps.personalizeProductWithPhoto(product);
	}
}
