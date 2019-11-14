package pages.checkout;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;
import tools.models.CartModel;

public class ShoppingCartPage extends AbstractPage {

	@FindBy(css = "#shopping-cart-table")
	private WebElementFacade productsContainter;

	@FindBy(css = "li.item button.action")
	private WebElement proceedToCheckoutButton;

	@FindBy(css = ".action.viewcart")
	private WebElementFacade viewCartLink;

	public List<CartModel> grabProductsList() {

		element(productsContainter).waitUntilVisible();
		List<CartModel> productsList = new ArrayList<>();

		List<WebElement> products = productsContainter.findElements(By.cssSelector("tbody tr.item-info"));

		for (WebElement product : products) {
			CartModel cartModel = new CartModel();
			cartModel.setProductSku(product.findElement(By.cssSelector("p.additional-info")).getText());
			cartModel.setItemAvailability(product.findElement(By.cssSelector("div.stock span")).getText());
			cartModel.setItemName(product.findElement(By.cssSelector(".product-item-name a")).getText());
			cartModel.setProductPrice(product.findElement(By.cssSelector("td.col.price span.price")).getText());
			cartModel.setPlaqueStyleLabel(product.findElement(By.cssSelector("dl dt:nth-child(1)")).getText());
			cartModel.setPlaqueStyleOption(product.findElement(By.cssSelector("dl dd:nth-child(2)")).getText());
			cartModel.setFontStyleLabel(product.findElement(By.cssSelector("dl dt:nth-child(3)")).getText());
			cartModel.setFontStyleOption(product.findElement(By.cssSelector("dl dd:nth-child(4)")).getText());
			cartModel.setNameLabel(product.findElement(By.cssSelector("dl dt:nth-child(5)")).getText());
			cartModel.setNameText(product.findElement(By.cssSelector("dl dd:nth-child(6)")).getText());
			cartModel.setSentimentLine1Label(product.findElement(By.cssSelector("dl dt:nth-child(7)")).getText());
			cartModel.setSentimentLine1Text(product.findElement(By.cssSelector("dl dd:nth-child(8)")).getText());
			cartModel.setSentimentLine2Label(product.findElement(By.cssSelector("dl dt:nth-child(9)")).getText());
			cartModel.setSentimentLine2Text(product.findElement(By.cssSelector("dl dd:nth-child(10)")).getText());
			cartModel.setSentimentLine3Label(product.findElement(By.cssSelector("dl dt:nth-child(11)")).getText());
			cartModel.setSentimentLine3Text(product.findElement(By.cssSelector("dl dd:nth-child(12)")).getText());
			cartModel.setArtwoorkLabel(product.findElement(By.cssSelector("dl dt:nth-child(13)")).getText());
			cartModel.setArtwoorkOption(product.findElement(By.cssSelector("dl dd:nth-child(14)")).getText());
			cartModel.setChooseFrontPoemLabel(product.findElement(By.cssSelector("dl dt:nth-child(15)")).getText());
			cartModel.setFrontPoemOption(product.findElement(By.cssSelector("dl dd:nth-child(16)")).getText());
			cartModel.setChooseBackPoemLabel(product.findElement(By.cssSelector("dl dt:nth-child(17)")).getText());
			cartModel.setBackPoemOption(product.findElement(By.cssSelector("dl dd:nth-child(18)")).getText());
			cartModel.setItemQty(product.findElement(By.cssSelector("td.col.qty input[value]")).getAttribute("value"));
			cartModel.setItemSubtotal(product.findElement(By.cssSelector("td.col.subtotal span.price")).getText());
			cartModel.setProductPrice(product.findElement(By.cssSelector("td.col.price span.price")).getText());
			productsList.add(cartModel);
		}

		return productsList;
	}

	public void goToCart() {
		element(viewCartLink).waitUntilVisible();
		viewCartLink.click();
	}

	public void proceedToCheckout() {
		element(proceedToCheckoutButton).waitUntilVisible();
		// waitForElementToAppear(proceedToCheckoutButton,
		// Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		proceedToCheckoutButton.click();
	}
}
