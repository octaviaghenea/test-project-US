package pages.search;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class SearchListPage extends AbstractPage {

	@FindBy(css = "a.product-item-link")
	private WebElementFacade searchedItem;

	public void clickSearchedItem() {
		element(searchedItem).waitUntilVisible();
		searchedItem.click();

	}
}
