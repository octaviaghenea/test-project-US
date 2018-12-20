package steps;

import net.thucydides.core.annotations.Step;
import pages.header.HeaderPage;
import tools.models.ProductModel;

public class HeaderSteps {

	HeaderPage headerPage;
	
	@Step
	public void clickFreeShipping() {
		headerPage.clickFreeShipping();
	}
	
	@Step
	public void selectCmsPage(String cms) {
		headerPage.selectCmsPage(cms);
	}
	
	@Step 
	public void selectFromAccount(String link) {
		headerPage.selectFromAccount(link);
	}

//	@Step
//	public void clickOnLogin() {
//		headerPage.clickOnLogin();
//	}
//
//	@Step
//	public void searchProduct(ProductModel product) {
//		headerPage.seachForProduct(product.getProductSku());
//	}

}
