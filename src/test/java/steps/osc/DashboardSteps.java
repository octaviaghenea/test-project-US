package steps.osc;

import java.awt.AWTException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.osc.OSCDashboardPage;
import tools.constants.Constants;

public class DashboardSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	OSCDashboardPage oSCDashboardPage;

	@StepGroup
	public void goToProductPage() throws AWTException {
		accessAdminCatalog();
		searchProductSKU("PM11234");
		clickEditProduct();
		
	}
	 
	@Step
	public void accessAdminCatalog() throws AWTException {

		getDriver().manage().window().maximize();
		getDriver().get("http://Alexandra.pintilie:*d2W4Uga%V@" + Constants.OSC_URL);
		oSCDashboardPage.clickCatalogLink();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("********* " + getDriver().getCurrentUrl());
	}

	@Step
	public void searchProductSKU(String SKU) {
		oSCDashboardPage.searchProductSKU(SKU);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("********* " + getDriver().getCurrentUrl());
	}
	
	@Step
	public void clickEditProduct() {
		oSCDashboardPage.clickEditProduct();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("********* " + getDriver().getCurrentUrl());
	}
}
