package pages.product;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductReviewFormPage extends PageObject {

	@FindBy(css = "#product-review-table")
	private WebElementFacade ratingStarsContainer;

	@FindBy(css = "#nickname_field")
	private WebElementFacade nicknameInput;

	@FindBy(css = "#summary_field")
	private WebElementFacade summaryInput;

	@FindBy(css = "#review_field")
	private WebElementFacade reviewInput;

	@FindBy(css = "button.action.submit.primary")
	private WebElementFacade submitReviewButton;

	public void setRatingStars(String text) {
		element(ratingStarsContainer).waitUntilVisible();
		List<WebElement> ratingStarsList = ratingStarsContainer.find(By.cssSelector("div.control > label[for]"));

		for (WebElement ratingStarNow : ratingStarsList) {
			String starName = ratingStarNow.getText();
			System.out.println("Rating star are: " + starName);
			if (starName.contains(text)) {
				ratingStarNow.click();
			}
		}
	}

	public void enterNickname(String nickname) {
		nicknameInput.waitUntilVisible();
		nicknameInput.type(nickname);
	}

	public void enterSummary(String summary) {
		summaryInput.waitUntilVisible();
		summaryInput.type(summary);
	}

	public void enterReview(String review) {
		reviewInput.waitUntilVisible();
		reviewInput.type(review);
	}

	public void hitSubmitButton() {
		submitReviewButton.waitUntilVisible();
		submitReviewButton.click();
	}

}
