package pages.search;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {

	@FindBy(css = "#search")
	private WebElementFacade searchInput;

	public void seachForProduct(String text) {
		element(searchInput).waitUntilVisible();
		searchInput.type(text);
		searchInput.sendKeys(Keys.ENTER);
	}
}
