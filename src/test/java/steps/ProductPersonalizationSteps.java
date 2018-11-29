package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductPersonalizationPage;
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
		selectFirstOption(product.getFirstOption());
		selectSecondOption(product.getSecondOption());
		enterFirstEngravingLine(product.getFirstLine());
		enterSecondEngravingLine(product.getSecondLine());
		selectThirdOption(product.getThirdOption());

	}

	@StepGroup
	public void personalizeProduct(String firstOption, String secondOption, String firstEngravingLine,
			String secondEngravingLine, String thirdOption) {
		// productPersonalizationPage.personalizeProduct(personalizationOption,
		// personalizationInput);
		selectFirstOption(firstOption);
		selectSecondOption(secondOption);
		enterFirstEngravingLine(firstEngravingLine);
		enterSecondEngravingLine(secondEngravingLine);
		selectThirdOption(thirdOption);

		// selectsecondop(firstOption);

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

	@Step
	public void selectThirdOption(String thirdOption) {
		productPersonalizationPage.selectThirdOption(thirdOption);
	}

}
