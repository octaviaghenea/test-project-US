package tests.osc;

import java.awt.AWTException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.api.APICatalogOSCSteps;
import steps.api.APIEventsAppsSteps;
import steps.api.APIMagentoCatalogSteps;
import steps.osc.DashboardSteps;
import steps.osc.OSCProductSteps;
import tests.BaseTest;
import tools.factory.OSCProductFactory;
import tools.models.OSCProductModel;

@RunWith(SerenityRunner.class)

public class AccessProductPageTest extends BaseTest {

	@Steps
	DashboardSteps dashboardSteps;
	@Steps
	OSCProductSteps oscProductSteps;
	@Steps
	APICatalogOSCSteps apiCatalogOSCSteps;
	@Steps
	APIMagentoCatalogSteps apiMagentoCatalogSteps;
	@Steps
	APIEventsAppsSteps apiEventsAppsSteps;

	public OSCProductModel oscProductDetails;

	@Before
	public void dataSetup() {
		oscProductDetails = OSCProductFactory.getOSCProductDetails();
	}

	@Test
	public void accessProductPage() throws InterruptedException, AWTException {

		dashboardSteps.goToProductPage();
		oscProductSteps.enterProductDetails(oscProductDetails);
		oscProductSteps.clickUpdate();
	}

}
