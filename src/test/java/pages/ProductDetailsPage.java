package pages;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductDetailsPage extends PageObject {
	
	@FindBy(css = "#product-addtocart-button")
	private WebElementFacade addToCartButton;
	
	@FindBy(css = "#qty")
	private WebElementFacade quantityField;
	
	public void setQuantity(String quantity) {
		quantityField.waitUntilVisible();
		quantityField.sendKeys(Keys.BACK_SPACE);
		quantityField.type(quantity);
	}
	
	public void addToCart(){
		addToCartButton.waitUntilVisible();
		addToCartButton.click();
	}

}
