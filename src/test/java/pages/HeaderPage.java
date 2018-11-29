package pages;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderPage extends PageObject {

	@FindBy(css = "div.panel ul.header li:nth-child(2) a")
	private WebElementFacade loginLink;
	
	@FindBy(css = "#search")
	private WebElementFacade searchInput;

	public void clickOnLogin() {
		element(loginLink).waitUntilVisible();
		loginLink.click();
	}
	
	public void seachForProduct(String text) {
		element(searchInput).waitUntilVisible();
		searchInput.type(text);
		searchInput.sendKeys(Keys.ENTER);
	}

}
