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
		selectThirdOption(product.getThirdOption());
		selectFirstPoem(product.getFirstPoem());
		previewFrontPoems();
		closeFrontPoemsModal();
		enterFirstEngravingLine(product.getFirstLine());
		hitHelpButton();
		closeHelpModal();
		enterSecondEngravingLine(product.getSecondLine());
		enterThirdEngravingLine(product.getThirdLine());
		enterFourthEngravingLine(product.getFourthLine());
		selectSecondPoem(product.getSecondPoem());
		hitSaveButton();

	}
	
	@StepGroup
	public void personalizeProductWithPhoto(ProductModel product2) {
		hitPersonalizeButton();
		selectFirstOption(product2.getFirstOption());
		selectSecondOption(product2.getSecondOption());
		enterFirstEngravingLine(product2.getFirstLine());
		enterSecondEngravingLine(product2.getSecondLine());
		uploadPhoto2();
		enterCroppingNotes(product2.getCroppingNotes());
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

	@Step
	public void selectSecondOption(String secondOption) {
		productPersonalizationPage.selectSecondOption(secondOption);
	}

	@Step
	public void selectThirdOption(String thirdOption) {
		productPersonalizationPage.selectThirdOption(thirdOption);
	}

	@Step
	public void selectFirstPoem(String firstPoem) {
		productPersonalizationPage.selectFirstPoem(firstPoem);
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

	@Step
	public void enterFirstEngravingLine(String firstLine) {
		productPersonalizationPage.enterFirstengravingLine(firstLine);
	}

	@Step
	public void enterSecondEngravingLine(String secondLine) {
		productPersonalizationPage.enterSecondEngravingLine(secondLine);
	}

	private void enterThirdEngravingLine(String thirdLine) {
		productPersonalizationPage.enterThirdEngravingLine(thirdLine);

	}

	@Step
	private void enterFourthEngravingLine(String fourthLine) {
		productPersonalizationPage.enterFourthEngravingLine(fourthLine);

	}

	@Step
	private void selectSecondPoem(String secondPoem) {
		productPersonalizationPage.selectSecondPoem(secondPoem);

	}

	/*@Step
	public void uploadPhoto() {
		productPersonalizationPage.uploadImage();
	}*/
	
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
