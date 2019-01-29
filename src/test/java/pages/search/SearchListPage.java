package pages.search;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchListPage extends PageObject {

	@FindBy(css = "a.product-item-link")
	private WebElementFacade searchedItem;

	public void clickSearchedItem() {
		element(searchedItem).waitUntilVisible();
		searchedItem.click();

	}
}
