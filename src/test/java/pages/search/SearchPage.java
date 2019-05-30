package pages.search;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class SearchPage extends AbstractPage {

	@FindBy(css = "#search")
	private WebElementFacade searchInput;

	public void seachForProduct(String text) {
		element(searchInput).waitUntilVisible();
		searchInput.type(text);
		searchInput.sendKeys(Keys.ENTER);
	}
}
