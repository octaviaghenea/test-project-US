package steps.api;

import java.util.HashMap;
import java.util.Map;

import tools.constants.Constants;
import tools.entities.CatalogMagento;

public class APIMagentoCatalogSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	public CatalogMagento getMagentoProductBySKU(String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		Map<String, String> parametresMap = new HashMap<>();
		parametresMap.put("storeId", "1");
		return getResource("/V1/products/" + SKU, CatalogMagento.class, parametresMap);
	}

	public void deleteMagentoProduct(String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		deleteResource("/V1/products/" + SKU);
	}
}
