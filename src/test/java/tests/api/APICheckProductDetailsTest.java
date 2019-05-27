package tests.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.api.APICatalogOSCSteps;
import steps.api.APIEventsAppsSteps;
import steps.api.APIMagentoCatalogSteps;
import tools.entities.CatalogMagento;
import tools.entities.CatalogOSC;

@RunWith(SerenityRunner.class)

public class APICheckProductDetailsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	APICatalogOSCSteps apiCatalogOSCSteps;
	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;

	String ID = "19160";
	String SKU = "PM20160";

	@Test
	public void checkProductDetailsOSC() {

		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8080");

		apiCatalogOSCSteps.updateProductNameAndPrice(ID);
		apiEventsAppsSteps.triggerProductChange();
		
		CatalogOSC catalogOSC = apiCatalogOSCSteps.getProductByID(ID);
		System.out.println(catalogOSC);
		CatalogMagento catalogMagento = apiMagentoCatalogSteps.getMagentoProductBySKU(SKU);
		System.out.println(catalogMagento);
		
		apiCatalogOSCSteps.verifyProductMagentoToOSC(catalogMagento, catalogOSC);
	}
}
