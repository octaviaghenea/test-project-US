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

public class API0012CheckProductAfterDeleteTest extends BaseApiTest{

	@Steps
	APICatalogOSCSteps apiCatalogOSCSteps;
	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;

	String ID = "2304";
	String SKU = "PM3304";
	CatalogMagento catalogMagento;

	@Test
	public void checkProductDetailsAfterDelete() {

		apiMagentoCatalogSteps.deleteMagentoProduct(SKU);
		apiEventsAppsSteps.triggerProductChange(Integer.valueOf(ID));
		apiEventsAppsSteps.waitABitAfterEventTriggering(10000);
		

		CatalogMagento catalogMagento = apiMagentoCatalogSteps.getMagentoProductBySKU(SKU);
		System.out.println(catalogMagento);
		CatalogOSC catalogOSC = apiCatalogOSCSteps.getProductByID(ID);
		System.out.println(catalogOSC);

		apiCatalogOSCSteps.verifyProductMagentoToOSC(catalogMagento, catalogOSC);
	}
}
