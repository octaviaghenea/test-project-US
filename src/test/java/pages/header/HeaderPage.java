package pages.header;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class HeaderPage extends AbstractPage {

	@FindBy(css = "#view")
	private WebElementFacade freeShippingLink;

	@FindBy(css = ".panel .top-menu")
	private WebElementFacade cmsContainer;

	@FindBy(css = "div.my-account-links")
	private WebElementFacade myAccontLinksContainer;

	@FindBy(css = ".action.showcart")
	private WebElementFacade minicartLink;

	@FindBy(css = ".action.viewcart")
	private WebElementFacade viewCartLink;

	protected void waitForPageToLoad() {
		new WebDriverWait(getDriver(), 1)
				.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
	}

	public void clickFreeShipping() {
		element(freeShippingLink).waitUntilVisible();
		freeShippingLink.click();
	}

	public void selectCmsPage(String item) {

		element(cmsContainer).waitUntilVisible();

		List<WebElement> itemsList = cmsContainer.findElements(By.cssSelector("a"));
		for (WebElement itemNow : itemsList) {
			String itemText = itemNow.getText();
			System.out.println("CMS Items: " + itemText);
			if (itemText.toLowerCase().contains(item.toLowerCase())) {
				itemNow.click();
				break;
			}
		}
	}

	public void selectFromAccount(String item) {

		element(myAccontLinksContainer).waitUntilVisible();
		waitForElementToAppear(myAccontLinksContainer, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		myAccontLinksContainer.click();

		List<WebElement> itemsList = myAccontLinksContainer.findElements(By.cssSelector("li > a[href]"));
		for (WebElement itemNow : itemsList) {
			String itemText = itemNow.getText();
			System.out.println("Links are: " + itemText);
			if (itemText.toLowerCase().contains(item.toLowerCase())) {
				itemNow.click();
				break;
			}
		}
	}

	public void goToMiniCart() {
		element(minicartLink).waitUntilVisible();
		waitForElementToAppear(minicartLink, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		minicartLink.click();
	}

	public void goToCart() {
		element(viewCartLink).waitUntilVisible();
		viewCartLink.click();
	}
}
