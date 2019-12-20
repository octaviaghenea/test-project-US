package pages.osc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class OSCDashboardPage extends AbstractPage {
	
	@FindBy(css = "td.main a[href$='catalog']")
	private WebElementFacade catalogURL;
	
	@FindBy(css = "input[name='search']")
	private WebElementFacade searchInput;
	
	@FindBy(css = ".infoBoxContent img[alt='Edit']")
	private WebElementFacade editProductButton;
	
	public void clickCatalogLink() {
		element(catalogURL).waitUntilVisible();
		catalogURL.click();
	}
	
	public void searchProductSKU(String SKU) {
		element(searchInput).waitUntilVisible();
		searchInput.typeAndEnter(SKU);
	}	
	
	public void clickEditProduct() {
		element(editProductButton).waitUntilVisible();
		editProductButton.click();
	}
}
