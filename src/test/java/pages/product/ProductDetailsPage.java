package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;
import tools.utils.StringUtils;

public class ProductDetailsPage extends AbstractPage {

	@FindBy(css = "#product-addtocart-button")
	private WebElementFacade addToCartButton;

	@FindBy(css = "#qty")
	private WebElementFacade quantityField;

	//@FindBy(css = "button.write-review")
	@FindBy(css = "#write-review")
	private WebElementFacade reviewsButton;

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

	public void goToWriteAReview() {
		//scrollDownToElement(reviewsButton);
		reviewsButton.waitUntilVisible();
		waitForElementToAppear(reviewsButton, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		reviewsButton.click();
	}

	public String getAddedToCartMessage() {
		addedToCartMessage.waitUntilVisible();
		waitForElementToAppear(addedToCartMessage, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
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
