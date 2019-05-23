package steps.api;

import tools.constants.Constants;
import tools.entities.CatalogMagento;

public class APIMagentoCatalogSteps extends AbstractApiSteps {

	private static final long serialVersionUID = 1L;

	public CatalogMagento getMagentoProductBySKU(String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		return getResource("/V1/products/" + SKU, CatalogMagento.class);
	}

	public void deleteMagentoProduct(String SKU) {
		AbstractApiSteps.URL = Constants.URL_MAGENTO;
		AbstractApiSteps.extraHeaders.put("Authorization", "Bearer " + Constants.API_KEY);
		deleteResource("/V1/products/" + SKU);
	}
}
