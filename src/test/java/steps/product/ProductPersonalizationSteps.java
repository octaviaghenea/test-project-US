package steps.product;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.product.ProductPersonalizationPage;
import tools.models.ProductModel;

public class ProductPersonalizationSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ProductPersonalizationPage productPersonalizationPage;

	// exemplu
	@StepGroup
	public void personalizeProduct(ProductModel product) {
		hitPersonalizeButton();
		selectFirstOption(product.getFirstOption());
		selectSecondOption(product.getSecondOption());
		enterFirstEngravingLine(product.getFirstLine());
		enterSecondEngravingLine(product.getSecondLine());
		// selectThirdOption(product.getThirdOption());
		uploadPhoto();
		enterCroppingNotes(product.getCroppingNotes());
		hitSaveButton();

	}

	@Step
	public void hitPersonalizeButton() {
		productPersonalizationPage.hitPersonalizeButton();
	}

	@Step
	public void selectFirstOption(String firstOption) {
		productPersonalizationPage.selectFirstOption(firstOption);
	}

	// generatenewMethod for selectsecondop
	@Step
	public void selectSecondOption(String secondOption) {
		productPersonalizationPage.selectSecondOption(secondOption);
	}

	@Step
	public void enterFirstEngravingLine(String firstLine) {
		productPersonalizationPage.enterFirstengravingLine(firstLine);
	}

	@Step
	public void enterSecondEngravingLine(String secondLine) {
		productPersonalizationPage.enterSecondEngravingLine(secondLine);
	}

	/*
	 * @Step public void selectThirdOption(String thirdOption) {
	 * productPersonalizationPage.selectThirdOption(thirdOption); }
	 */

	@Step
	public void enterCroppingNotes(String notes) {
		productPersonalizationPage.enterCroppingNotes(notes);
	}
	
	@Step
	public void uploadPhoto() {
		productPersonalizationPage.uploadImage();
	}

	@Step
	public void hitSaveButton() {
		productPersonalizationPage.hitSaveButton();
	}
}
