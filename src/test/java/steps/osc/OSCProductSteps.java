package steps.osc;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.osc.OSCProductPage;
import tools.models.OSCProductModel;

public class OSCProductSteps extends ScenarioSteps {

	
	private static final long serialVersionUID = 1L;
	
	OSCProductPage oscProductPage;
	
	@StepGroup
	public void enterProductDetails(OSCProductModel product) {
		enterProductName(product.getProductName());
		enterDescription(product.getProductDescription());
	}
	
	@Step 
	public void enterProductName(String text) {
		oscProductPage.enterProductName(text);
	}
	
	@Step
	public void enterDescription(String text) {
		oscProductPage.enterDescription(text);
	}
	
	@Step
	public void clickUpdate() {
		oscProductPage.clickUpdate();
	}
}
