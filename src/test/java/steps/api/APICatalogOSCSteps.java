package steps.api;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.CatalogMagento;
import tools.entities.CatalogOSC;
import tools.entities.product.Product;
import tools.factory.CatalogOSCFactory;
import tools.utils.StringUtils;

public class APICatalogOSCSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;
	
	@Step
	public CatalogOSC getProductByID(String SKU) {
		AbstractApiSteps.URL = Constants.URL_OSC_CATALOG;
		return getResource("/products/" + SKU, CatalogOSC.class);
	}

	@Step
	public void updateProductNameAndPrice(String ID) {
		AbstractApiSteps.URL = Constants.URL_OSC_CATALOG;
		CatalogOSC productRequest = CatalogOSCFactory.getOSCProductDetails();
		Map<String, String> parametersMap = new HashMap<>();
		System.out.println(parametersMap.put("name", productRequest.getName()));
		System.out.println(parametersMap.put("price", productRequest.getPrice()));
		updateResourse("products/" + ID, "[]", parametersMap);
	}

	@Step
	public void verifyProductMagentoToOSC(CatalogMagento productMagento, CatalogOSC productOSC) {
		System.out.println("Magento product price is: " + StringUtils.doubleToIntString(productMagento.getPrice()) + " Magento product name is: "
				+ productMagento.getName());
		System.out.println("OSC product price is: " + StringUtils.doubleToIntString(productOSC.getPrice())
				+ " OSC product name is: " + productOSC.getName());
		Assert.assertTrue("Product name not mathcing!! " + "Magento name is: " + productMagento.getName()
				+ " and OSC name is: " + productOSC.getName(),
				productMagento.getName().contentEquals(productOSC.getName()));

		Assert.assertTrue(
				"Product price not mathcing!! " + "Magento price is: " + StringUtils.doubleToIntString(productMagento.getPrice())
						+ " and OSC price is: " + StringUtils.doubleToIntString(productOSC.getPrice()),
						StringUtils.doubleToIntString(productMagento.getPrice()).contentEquals(StringUtils.doubleToIntString(productOSC.getPrice())));
	}
}