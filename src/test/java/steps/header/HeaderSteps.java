package steps.header;

import net.thucydides.core.annotations.Step;
import pages.header.HeaderPage;

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
	
	@Step
	public void goToMiniCart(){
		headerPage.goToMiniCart();
	}

	@Step
	public void goToCart() {
		headerPage.goToCart();
	}
}
