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

public class API0012CheckProductAfterDeleteTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	APICatalogOSCSteps apiCatalogOSCSteps;
	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;

	String ID = "5442";
	String SKU = "PM6442";

	@Test
	public void checkProductDetailsAfterDelete() {

		System.setProperty("https.proxyHost", "localhost");
		System.setProperty("https.proxyPort", "8080");

		apiMagentoCatalogSteps.deleteMagentoProduct(SKU);
		apiEventsAppsSteps.triggerProductChange();

		CatalogMagento catalogMagento = apiMagentoCatalogSteps.getMagentoProductBySKU(SKU);
		System.out.println(catalogMagento);
		CatalogOSC catalogOSC = apiCatalogOSCSteps.getProductByID(ID);
		System.out.println(catalogOSC);

		apiCatalogOSCSteps.verifyProductMagentoToOSC(catalogMagento, catalogOSC);
	}
}
