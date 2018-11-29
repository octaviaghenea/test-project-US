package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPersonalizationPage extends PageObject {

	@FindBy(css = "#product-options-wrapper")
	private WebElementFacade personalizationContainer;

	@FindBy(css = "#options_39012_text")
	private WebElementFacade engravingFirstInput;

	@FindBy(css = "#options_39011_text")
	private WebElementFacade engravingSecondInput;

	public void personalizeProduct(String personalizationsOption, String personalizationInput) {
		element(personalizationContainer).waitUntilVisible();
		List<WebElement> optionItemList = personalizationContainer.findElements(By.cssSelector(".control"));

		// need to have more options or same number as desired personalizations.
		// if(personalizationsList.size() > 0 && personalizationsList.size() <=
		// optionItemList.size()){
		// int i = 0;
		for (WebElement webElement : optionItemList) {
			WebElement optionHandle = webElement
					.findElement(By.cssSelector("[name*='option']:not([type='file']):not([type='hidden'])"));

			if (optionHandle.getTagName().contains("select")) {
				element(optionHandle).selectByVisibleText(personalizationsOption);
			}
			if (optionHandle.getTagName().contains("input")) {
				// if(!optionHandle.getAttribute("type").contains("file") &&
				// !optionHandle.getAttribute("type").contains("hidden"))
				// optionHandle.sendKeys(personalizationsList.get(i));
				optionHandle.sendKeys(personalizationInput);
			}
			// i++;
		}
	}

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
}
