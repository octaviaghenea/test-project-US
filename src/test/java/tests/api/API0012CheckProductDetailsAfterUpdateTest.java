package tests.api;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APICatalogOSCSteps;
import steps.api.APIEventsAppsSteps;
import steps.api.APIMagentoCatalogSteps;
import tools.entities.CatalogMagento;
import tools.entities.CatalogOSC;

@RunWith(SerenityRunner.class)

public class API0012CheckProductDetailsAfterUpdateTest extends BaseApiTest {

	@Steps
	APICatalogOSCSteps apiCatalogOSCSteps;
	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;

	String ID = "7132";
	String SKU = "PM8132";

	@Test
	public void checkProductDetailsAfterUpdateOSC() {

		apiCatalogOSCSteps.updateProductNameAndPrice(ID);
		apiEventsAppsSteps.triggerProductChange(Integer.valueOf(ID));
		apiEventsAppsSteps.waitABitAfterEventTriggering(10000);

		CatalogOSC catalogOSC = apiCatalogOSCSteps.getProductByID(ID);
		System.out.println(catalogOSC);
		CatalogMagento catalogMagento = apiMagentoCatalogSteps.getMagentoProductBySKU(SKU);
		System.out.println(catalogMagento);

		apiCatalogOSCSteps.verifyProductMagentoToOSC(catalogMagento, catalogOSC);
	}
}
