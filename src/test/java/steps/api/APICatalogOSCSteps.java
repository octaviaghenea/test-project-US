package steps.api;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.CatalogMagento;
import tools.entities.CatalogOSC;
import tools.factory.CatalogOSCFactory;

public class APICatalogOSCSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public CatalogOSC getProductByID(String SKU) {
		AbstractApiSteps.URL = Constants.URL_OSC_CATALOG;
		return getResource("/products/" + SKU, CatalogOSC.class);
	}

	@Step
	public CatalogOSC updateProductNameAndPrice() {
		CatalogOSC productRequest = CatalogOSCFactory.getOSCProductDetails();
		CatalogOSC updatedProduct = updateResourse("", productRequest, CatalogOSC.class);	
		return updatedProduct;
	}

	@Step
	public void verifyProductMagentoToOSC(CatalogMagento productMagento, CatalogOSC productOSC) {
		System.out.println("Magento product price is: " + productMagento.getPrice() + " Magento product name is: "
				+ productMagento.getName());
		System.out.println(
				"OSC product price is: " + productOSC.getPrice() + " OSC product name is: " + productOSC.getName());
		Assert.assertTrue("Product name not mathcing!! ", productMagento.getName().contentEquals(productOSC.getName()));
		Assert.assertTrue("Product price not mathcing!! ",
				productMagento.getPrice().contentEquals(productOSC.getPrice()));
	}

}