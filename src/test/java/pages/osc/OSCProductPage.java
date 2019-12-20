package pages.osc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

public class OSCProductPage extends AbstractPage {
	
	@FindBy(css = "td.main input[name$='products_name[1]'")
	private WebElementFacade productNameContainer;
	
	@FindBy(css = "#tinymce")
	private WebElementFacade descriptionContainer;
	
	@FindBy(css ="td.main input[alt$='Update']")
	private WebElementFacade updateButton;
	
	public void enterProductName(String text) {
		element(productNameContainer).waitUntilVisible();
		productNameContainer.type(text);
	}
	
	public void enterDescription(String text) {
		getDriver().switchTo().frame("products_description[1]_ifr");
		element(descriptionContainer).waitUntilVisible();
		descriptionContainer.type(text);
		getDriver().switchTo().defaultContent();
	}
	
	public void clickUpdate() {
		element(updateButton).waitUntilVisible();
		updateButton.click();
	}
}
