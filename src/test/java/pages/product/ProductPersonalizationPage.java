package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPersonalizationPage extends PageObject {

	@FindBy(css = "#show-personalize")
	private WebElementFacade personalizeButton;

	@FindBy(css = ".save-personalization")
	private WebElementFacade saveButton;

	@FindBy(css = "#product-options-wrapper")
	private WebElementFacade personalizationContainer;

	@FindBy(css = "#options_39012_text")
	private WebElementFacade engravingFirstInput;

	@FindBy(css = "#options_39011_text")
	private WebElementFacade engravingSecondInput;

	public void selectFirstOption(String firstOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_39010")));
		oSelect.selectByVisibleText(firstOption);
	}

	public void selectSecondOption(String secondOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_39009")));
		oSelect.selectByVisibleText(secondOption);
	}

	public void enterFirstengravingLine(String engravingFirstLine) {
		element(engravingFirstInput).waitUntilVisible();
		engravingFirstInput.type(engravingFirstLine);
	}

	public void enterSecondEngravingLine(String engravingSecondLine) {
		element(engravingSecondInput).waitUntilVisible();
		engravingSecondInput.type(engravingSecondLine);
	}

	public void selectThirdOption(String thirdOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_39013")));
		oSelect.selectByVisibleText(thirdOption);
	}

	public void hitSaveButton() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}

	public void hitPersonalizeButton() {
		element(personalizeButton).waitUntilVisible();
		personalizeButton.click();

	}
}
