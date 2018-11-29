package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductListPage extends PageObject {
	
	@FindBy(css = "a.product-item-link")
	private WebElementFacade productName;
	
	public void clickOnProductName() {
		element(productName).waitUntilVisible();
		productName.click();
	}

}
