package pages.product;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import tools.utils.StringUtils;

public class ProductDetailsPage extends PageObject {

	@FindBy(css = "#product-addtocart-button")
	private WebElementFacade addToCartButton;

	@FindBy(css = "#qty")
	private WebElementFacade quantityField;

	@FindBy(css = "#tab-label-reviews-title")
	private WebElementFacade reviewsTab;

	@FindBy(css = ".message-success div")
	private WebElementFacade addedToCartMessage;

	public void setQuantity(String quantity) {
		quantityField.waitUntilVisible();
		quantityField.sendKeys(Keys.BACK_SPACE);
		quantityField.type(quantity);
	}

	public void addToCart() {
		addToCartButton.waitUntilVisible();
		addToCartButton.click();
	}

	public void goToReviewsTab() {
		reviewsTab.waitUntilVisible();
		reviewsTab.click();
	}

	public String getAddedToCartMessage() {
		addedToCartMessage.waitUntilVisible();
		// TODO waitu
		waitABit(4000);
		return addedToCartMessage.getText();
	}

	public String getPriceWithPersonalization() {

		return StringUtils.cleanStringToNumber(getDriver()
				.findElement(By.cssSelector(".product-add-form span[data-price-type='finalPrice'] span")).getText());

	}

	public String getProductPrice() {

		return StringUtils.cleanStringToNumber(
				getDriver().findElement(By.cssSelector(".product-info-price span[data-price-type='initialPrice'] span"))
						.getText());
	}
}
