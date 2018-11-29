package steps;

import net.thucydides.core.annotations.Step;
import pages.ProductListPage;

public class ProductListSteps {
	
	ProductListPage productListPage;
	
	@Step
	public void clickOnProductName() {
		productListPage.clickOnProductName();
	}

}
