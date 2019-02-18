package steps.product;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.product.ProductPersonalizationPage;
import tools.models.ProductPersonalizationModel;
import tools.models.ProductPersonalizationWithPhotoModel;

public class ProductPersonalizationSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ProductPersonalizationPage productPersonalizationPage;

	@StepGroup
	public void personalizeProduct(ProductPersonalizationModel product) {

		hitPersonalizeButton();
		selectOption(product.getPlaqueStyleLabel(), product.getPlaqueStyleOption());
		selectOption(product.getArtwoorkLabel(), product.getArtwoorkOption());
		selectOption(product.getFontStyleLabel(), product.getFontStyleOption());
		selectOption(product.getChooseFrontPoemLabel(), product.getFrontPoemOption());
		previewFrontPoems();
		closeFrontPoemsModal();
		enterEngravingLine(product.getNameLabel(), product.getNameText());
		hitHelpButton();
		closeHelpModal();
		enterEngravingLine(product.getSentimentLine1Label(), product.getSentimentLine1Text());
		enterEngravingLine(product.getSentimentLine2Label(), product.getSentimentLine2Text());
		enterEngravingLine(product.getSentimentLine3Label(), product.getSentimentLine3Text());
		selectOption(product.getChooseBackPoemLabel(), product.getBackPoemOption());
		hitSaveButton();
	}

	@StepGroup
	public void personalizeProductWithPhoto(ProductPersonalizationWithPhotoModel product) {
		hitPersonalizeButton();
		selectOption(product.getEmbraceHeart(), product.getEngravingOnHeart());
		selectOption(product.getHeartFont(), product.getScriptFont());
		enterEngravingLine(product.getHeartLine1(), product.getTextLine1());
		enterEngravingLine(product.getHeartLine2(), product.getTextLine2());
		uploadPhoto2();
		enterCroppingNotes(product.getPhotoCroppingNotes());
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
	 * @Step public void uploadPhoto() {
	 * productPersonalizationPage.uploadImage(); }
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
