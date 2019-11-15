package tests.api;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APIMagentoCatalogSteps;
import tools.entities.product.ProductModel;
import tools.factory.ProductMagentoFactory;

@RunWith(SerenityRunner.class)

public class API0012CreateProductUsingAPI extends BaseApiTest {

	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	
	public ProductModel product;
	public String SKU;
	
	
	@Before
	public void dataSetup() throws IOException {

		product = ProductMagentoFactory.getMagentoProductInstance();
		//SKU = product.getSku();
		SKU = "Test011";
	}
	
	@Test
	public void createProductUsingApi() {
		
		ProductModel prod = apiMagentoCatalogSteps.createMagentoProductUsingAPI(product, SKU);
		System.out.println(prod);
		
		//apiMagentoCatalogSteps.getMagentoProductBySKU(SKU);
	}
	
}
