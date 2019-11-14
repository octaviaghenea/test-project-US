package steps.api;

import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Step;
import tools.constants.Constants;
import tools.entities.CatalogMagento;
import tools.entities.product.Product;
import tools.factory.ProductMagentoFactory;

public class APIMagentoCatalogSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	public CatalogMagento getMagentoProductBySKU(String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		Map<String, String> parametersMap = new HashMap<>();
		parametersMap.put("storeId", "1");
		return getResource("/V1/products/" + SKU, "[]", CatalogMagento.class);
	}

	@Step
	public Product createMagentoProductUsingAPI(Product product, String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.parametersMap = new HashMap<>();
		parametersMap.put("sku", product.getSku());
		System.out.println(parametersMap);
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		Product productRequest =  ProductMagentoFactory.getMagentoProductInstance();
		Product prod = updateResourse("/V1/products/" + SKU, productRequest, Product.class);
				return prod;
	}
	
	public void deleteMagentoProduct(String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		deleteResource("/V1/products/" + SKU);
	}
}
