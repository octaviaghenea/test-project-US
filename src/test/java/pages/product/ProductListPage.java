package pages.product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class ProductListPage extends AbstractPage {
	
	@FindBy(css = "a.product-item-link")
	private WebElementFacade productName;
	
	public void clickOnProductName() {
		element(productName).waitUntilVisible();
		productName.click();
	}

}
