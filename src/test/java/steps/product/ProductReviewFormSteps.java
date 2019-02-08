package steps.product;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.product.ProductReviewFormPage;
import tools.models.ProductReviewModel;

public class ProductReviewFormSteps {

	ProductReviewFormPage productReviewFormPage;

	@StepGroup
	public void reviewProduct(ProductReviewModel productReviewModel) {
		setRatingStar(productReviewModel.getRatingStars());
		enterNickname(productReviewModel.getNickname());
		enterSummary(productReviewModel.getSummary());
		enterReview(productReviewModel.getReview());
	}

	@Step
	public void setRatingStar(String ratingStars) {
		productReviewFormPage.setRatingStars(ratingStars);
	}

	@Step
	public void enterNickname(String nickname) {
		productReviewFormPage.enterNickname(nickname);
	}

	@Step
	public void enterSummary(String summary) {
		productReviewFormPage.enterSummary(summary);
	}

	@Step
	public void enterReview(String review) {
		productReviewFormPage.enterReview(review);
	}
	
	@Step
	public void hitSubmitButton() {
		productReviewFormPage.hitSubmitButton();
	}
}
