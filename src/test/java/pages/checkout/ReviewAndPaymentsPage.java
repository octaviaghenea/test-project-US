package pages.checkout;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;
import tools.constants.Constants;

public class ReviewAndPaymentsPage extends AbstractPage {

	@FindBy(css = "div.items.payment-methods")
	private WebElementFacade paymentMethodsContainer;

	@FindBy(css = "input#authorizenet_acceptjs")
	private WebElementFacade authorizeNetMethod;

	@FindBy(css = "input[name='payment[cc_number]")
	private WebElementFacade creditCardNumberInput;

	@FindBy(css = "select[name='payment[cc_exp_month]")
	private WebElementFacade dateDropdown;

	@FindBy(css = "select[name='payment[cc_exp_year]")
	private WebElementFacade yearDropdown;

	@FindBy(css = "input[name='payment[cc_cid]")
	private WebElementFacade cardVerificationNumberInput;

	@FindBy(css = "#billing-address-same-as-shipping-shared")
	private WebElementFacade billingAddressCheckbox;

	@FindBy(css = "._active button.action.primary.checkout")
	private WebElementFacade placeOrderButton;
	
	@FindBy(css = "#block-comment-heading")
	private WebElementFacade commentLink;
	
	@FindBy(css = "#comment-code")
	private WebElementFacade commentBox;

	public void selectPaymentMethod(String paymentMethod) {	

		By loader = By.className("loader");
		waitForLoaderToDissapear(loader, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);

		element(paymentMethodsContainer).waitUntilVisible();

		int counter = 1;
		List<WebElement> paymentMethodsList = paymentMethodsContainer
				.findElements(By.cssSelector(".payment-method-title.field.choice"));
		while (paymentMethodsList.size() == 0 && counter < 30) {
			waitABit(100);
			counter++;
			paymentMethodsList = paymentMethodsContainer
					.findElements(By.cssSelector(".payment-method-title.field.choice"));
		}

		boolean optionFound = false;
		for (WebElement elementNow : paymentMethodsList) {
			String labelNow = elementNow.findElement(By.cssSelector("label[for]")).getText();
			if (labelNow.contains(paymentMethod)) {
				optionFound = true;
				elementNow.findElement(By.cssSelector("input.radio")).click();
				break;
			}
		}
		Assert.assertTrue("The options has not been found", optionFound);
	}

	public void selectPaymentMethod() {
		element(authorizeNetMethod).waitUntilVisible();
		authorizeNetMethod.click();

	}

	public void enterCardDetails(String number) {
		element(creditCardNumberInput).waitUntilVisible();
		waitForElementToAppear(creditCardNumberInput, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
		creditCardNumberInput.type(number);
	}

	public void selectExpirationDate(String value) {
		element(dateDropdown).waitUntilVisible();
		dateDropdown.selectByVisibleText(value);
	}

	public void selectExpirationYear(String value) {
		element(yearDropdown).waitUntilVisible();
		yearDropdown.selectByVisibleText(value);
	}

	public void enterCCV(String ccv) {
		element(cardVerificationNumberInput).waitUntilVisible();
		cardVerificationNumberInput.type(ccv);
	}

	public void checkBillingAddress() {
		element(billingAddressCheckbox).waitUntilVisible();
		billingAddressCheckbox.click();
	}
	
	public void clickCommentLink() {
		element(commentLink).waitUntilVisible();
		commentLink.click();
	}
	public void enterComment(String comment) {
		element(commentBox).waitUntilVisible();
		commentBox.type(comment);
	}

	public void hitPlaceOrder() {
		element(placeOrderButton).waitUntilVisible();
		placeOrderButton.click();
		
//		By loader = By.className("loader");
//		waitForLoaderToDissapear(loader, Constants.WAIT_TIME_FOUR_SECONDS_IN_MILISECONDS);
	}
}
