package pages.product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPersonalizationPage extends PageObject {

	@FindBy(css = "#show-personalize")
	private WebElementFacade personalizeButton;

	@FindBy(css = "#options_95341_text")
	private WebElementFacade engravingFirstInput;

	@FindBy(css = "#options_95340_text")
	private WebElementFacade engravingSecondInput;

	@FindBy(css = "#options_95339_text")
	private WebElementFacade engravingThirdInput;

	@FindBy(css = "#options_95342_text")
	private WebElementFacade engravingFourthInput;

	@FindBy(css = "#options_3965_text")
	private WebElementFacade croppingNotes;

	@FindBy(css = ".preview-poems")
	private WebElementFacade frontPoemsButton;

	@FindBy(css = ".poems-modal .action-close")
	private WebElementFacade closeFrontPoemsModal;

	@FindBy(css = "#preview-name")
	private WebElementFacade helpButton;

	@FindBy(css = ".name-modal .action-close")
	private WebElementFacade closeHelpModal;

	@FindBy(css = ".save-personalization")
	private WebElementFacade saveButton;

	public void hitPersonalizeButton() {
		element(personalizeButton).waitUntilVisible();
		personalizeButton.click();
	}

	public void selectFirstOption(String firstOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_95347")));
		oSelect.selectByVisibleText(firstOption);
	}

	public void selectSecondOption(String secondOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_95344")));
		oSelect.selectByVisibleText(secondOption);
	}

	public void selectThirdOption(String thirdOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_95343")));
		oSelect.selectByVisibleText(thirdOption);
	}

	public void selectFirstPoem(String fourthOption) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_95345")));
		oSelect.selectByVisibleText(fourthOption);
	}

	public void previewFrontPoems() {
		element(frontPoemsButton).waitUntilVisible();
		frontPoemsButton.click();
		waitABit(1000);
	}

	public void closeFrontPoemsModal() {
		element(closeFrontPoemsModal).waitUntilVisible();
		closeFrontPoemsModal.click();
	}

	public void hitHelpButton() {
		element(helpButton).waitUntilVisible();
		helpButton.click();
	}

	public void closeHelpModal() {
		element(closeHelpModal).waitUntilVisible();
		closeHelpModal.click();
	}

	public void enterFirstengravingLine(String engravingFirstLine) {
		element(engravingFirstInput).waitUntilVisible();
		engravingFirstInput.type(engravingFirstLine);
	}

	public void enterSecondEngravingLine(String engravingSecondLine) {
		element(engravingSecondInput).waitUntilVisible();
		engravingSecondInput.type(engravingSecondLine);
	}

	public void enterThirdEngravingLine(String thirdLine) {
		element(engravingThirdInput).waitUntilVisible();
		engravingThirdInput.type(thirdLine);
	}

	public void enterFourthEngravingLine(String fourthLine) {
		element(engravingFourthInput).waitUntilVisible();
		engravingFourthInput.type(fourthLine);
	}

	public void selectSecondPoem(String secondPoem) {
		Select oSelect = new Select(getDriver().findElement(By.id("select_95346")));
		oSelect.selectByVisibleText(secondPoem);
	}

	public void uploadImage() {

		getDriver().findElement(By.name("options_3964_file")).click();

		// copy the String to the clipboard
		StringSelection s = new StringSelection("F:\\chuchu.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// paste the string
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

	public void enterCroppingNotes(String notes) {
		element(croppingNotes).waitUntilVisible();
		croppingNotes.type(notes);
	}

	public void hitSaveButton() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}

}
