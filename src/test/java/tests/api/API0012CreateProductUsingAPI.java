package tests.api;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APIMagentoCatalogSteps;
import tools.entities.product.Product;
import tools.factory.ProductMagentoFactory;

@RunWith(SerenityRunner.class)

public class API0012CreateProductUsingAPI extends BaseApiTest {

	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	
	public Product product;
	public String SKU;
	
	
	@Before
	public void dataSetup() throws IOException {

		product = ProductMagentoFactory.getMagentoProductInstance();
		SKU = product.getSku();
		//SKU = "PM11234";
	}
	
	@Test
	public void createProductUsingApi() {
		
		Product prod = apiMagentoCatalogSteps.createMagentoProductUsingAPI(product, SKU);
		System.out.println(prod);
		
		//apiMagentoCatalogSteps.getMagentoProductBySKU(SKU);
	}
	
}
