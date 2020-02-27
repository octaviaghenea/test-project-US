package tests.api;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APICatalogOSCSteps;
import steps.api.APIEventsAppsSteps;
import steps.api.APIMagentoCatalogSteps;
import tools.entities.CatalogMagento;
import tools.entities.productMagento.Options;
import tools.entities.productOSC.CatalogOSC;
import tools.entities.productOSC.OptionsOSC;

@RunWith(SerenityRunner.class)

public class API0012CheckProductAfterDeleteTest extends BaseApiTest {

	@Steps
	APICatalogOSCSteps apiCatalogOSCSteps;
	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;

	String ID = "10234";
	String SKU = "PM11234";
	CatalogMagento catalogMagento;

	@Test
	public void checkProductDetailsAfterDelete() {

		/*
		 * apiMagentoCatalogSteps.deleteMagentoProduct(SKU);
		 * apiEventsAppsSteps.triggerProductChange(Integer.valueOf(ID));
		 * apiEventsAppsSteps.waitABitAfterEventTriggering(100000);
		 */

		/*
		 * CatalogMagento catalogMagento =
		 * apiMagentoCatalogSteps.getMagentoProductBySKU(SKU); List<Options>
		 * options = catalogMagento.getOptions(); System.out.println(options);
		 */

		OptionsOSC catalogOSC = apiCatalogOSCSteps.getProductOptionsByID(ID);
		System.out.println(catalogOSC);

		/*CatalogOSC catalogOSC2 = apiCatalogOSCSteps.getProductByID(ID);
		System.out.println(catalogOSC2);*/

		/*
		 * apiCatalogOSCSteps.verifyProductMagentoToOSC(catalogMagento,
		 * catalogOSC);
		 */

	}
}
