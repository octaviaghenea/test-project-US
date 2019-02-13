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

	@StepGroup
	public void personalizeProduct(ProductModel product) {

		hitPersonalizeButton();
		previewFrontPoems();
		closeFrontPoemsModal();
		hitHelpButton();
		closeHelpModal();
		hitSaveButton();
	}

	@StepGroup
	public void personalizeProductWithPhoto(ProductModel product2) {
		hitPersonalizeButton();
		selectOption(product2.getLabelOption(), product2.getFirstOption());
		enterEngravingLine(product2.getLabelLine(), product2.getFirstLine());
		uploadPhoto2();
		enterCroppingNotes(product2.getCroppingNotes());
		hitSaveButton();
	}

	@Step
	public void hitPersonalizeButton() {
		productPersonalizationPage.hitPersonalizeButton();
	}

	@Step
	public void selectOption(String label, String option) {
		productPersonalizationPage.selectOption(label, option);
	}

	@Step
	public void enterEngravingLine(String label, String text) {
		productPersonalizationPage.enterText(label, text);
	}

	public void previewFrontPoems() {
		productPersonalizationPage.previewFrontPoems();
	}

	public void closeFrontPoemsModal() {
		productPersonalizationPage.closeFrontPoemsModal();
	}

	@Step
	public void hitHelpButton() {
		productPersonalizationPage.hitHelpButton();
	}

	@StepGroup
	public void closeHelpModal() {
		productPersonalizationPage.closeHelpModal();
	}

	/*
	 @Step public void uploadPhoto() {
	 productPersonalizationPage.uploadImage();
	 }
	 */

	@Step
	public void uploadPhoto2() {
		productPersonalizationPage.uploadImage2();
	}

	@Step
	public void enterCroppingNotes(String notes) {
		productPersonalizationPage.enterCroppingNotes(notes);
	}

	@Step
	public void hitSaveButton() {
		productPersonalizationPage.hitSaveButton();
	}
}
