package steps;

import net.thucydides.core.annotations.Step;
import pages.HeaderPage;
import tools.models.ProductModel;

public class HeaderSteps {

	HeaderPage headerPage;

	@Step
	public void clickOnLogin() {
		headerPage.clickOnLogin();
	}

	@Step
	public void searchProduct(ProductModel product) {
		headerPage.seachForProduct(product.getProductSku());
	}

}
