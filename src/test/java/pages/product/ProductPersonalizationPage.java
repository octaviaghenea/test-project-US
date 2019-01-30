package pages.product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

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

	@FindBy(css = "#options_3960_text")
	private WebElementFacade engravingFirstInput;

	@FindBy(css = "#options_3961_text")
	private WebElementFacade engravingSecondInput;

	@FindBy(css = "#options_3965_text")
	private WebElementFacade croppingNotes;
	
	public void selectFirstOption(String firstOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_3963")));
		oSelect.selectByVisibleText(firstOption);
	}

	public void selectSecondOption(String secondOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_3962")));
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

	public void uploadImage() {

		getDriver().findElement(By.name("options_3964_file")).click();
		
		//copy the String to the clipboard
		StringSelection s = new StringSelection("F:\\chuchu.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//paste the string
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			waitABit(1000);
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public void selectThirdOption(String thirdOption) { Select oSelect = new
	 * Select(getDriver().findElement(By.id("select_39013")));
	 * oSelect.selectByVisibleText(thirdOption); }
	 */
	
	public void enterCroppingNotes(String notes) {
		element(croppingNotes).waitUntilVisible();
		croppingNotes.type(notes);
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
