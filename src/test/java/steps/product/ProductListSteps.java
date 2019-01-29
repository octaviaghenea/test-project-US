package steps.product;

import net.thucydides.core.annotations.Step;
import pages.product.ProductListPage;

public class ProductListSteps {
	
	ProductListPage productListPage;
	
	@Step
	public void clickOnProductName() {
		productListPage.clickOnProductName();
	}

}
