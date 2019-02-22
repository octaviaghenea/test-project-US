package pages.product;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import tools.constants.Constants;

public class ProductPersonalizationPage extends PageObject {

	@FindBy(css = "#show-personalize")
	private WebElementFacade personalizeButton;

	@FindBy(css = "#custom-option-parent div select")
	private WebElementFacade customOptionSelect;

	@FindBy(css = ".control textarea[class]")
	private WebElementFacade croppingNotes;

	@FindBy(css = ".preview-poems")
	private WebElementFacade frontPoemsButton;

	@FindBy(css = ".poems-modal .action-close")
	private WebElementFacade closeFrontPoemsModal;

	@FindBy(css = "#preview-name")
	private WebElementFacade helpButton;

	@FindBy(css = ".name-modal .action-close")
	private WebElementFacade closeHelpModal;
	
	@FindBy(css = ".cost")
	private WebElementFacade personalizationCost;

	@FindBy(css = ".save-personalization")
	private WebElementFacade saveButton;
	
	public void hitPersonalizeButton() {
		element(personalizeButton).waitUntilVisible();
		personalizeButton.click();
	}

	public void selectOption(String label, String option) {

		WebElement select = null;
		boolean found = false;

		List<WebElement> selectsParentsList = getDriver().findElements(By.cssSelector("#custom-option-parent"));
		for (WebElement selectParent : selectsParentsList) {
			if (selectParent.findElement(By.cssSelector("label span")).getText().contentEquals(label)) {
				select = selectParent.findElement(By.cssSelector("div select"));
				found = true;
				break;
			}
		}
		Assert.assertTrue("The option has not been found", found);
		element(select).selectByVisibleText(option);
	}

	public void enterText(String label, String text) {

		WebElement input = null;

		List<WebElement> selectLabelsList = getDriver().findElements(By.cssSelector("#custom-option-parent"));
		for (WebElement selectLabel : selectLabelsList) {
			if (selectLabel.findElement(By.cssSelector("label span")).getText().contentEquals(label)) {
				input = selectLabel.findElement(By.cssSelector("div input"));
				break;
			}
		}
		element(input).type(text);
	}

	public String grabCustomOptionsPrices() {
		element(customOptionSelect).waitUntilVisible();
		List<WebElement> selectedPriceList = customOptionSelect.findElements(By.cssSelector("option[price]"));

		BigDecimal sumOfOptions = new BigDecimal(0);

		for (WebElement price : selectedPriceList) {
			String actualPrice = price.getText();
			sumOfOptions = sumOfOptions.add(new BigDecimal(actualPrice));
			System.out.println("Sum of options is: " + sumOfOptions);
		}

		return sumOfOptions.toString();

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

	public void uploadImage2() {

		File baseDir = new File(new File("").getAbsolutePath());
		getDriver().findElement(By.cssSelector("input[type='file'][class*='choose-image']"))
				.sendKeys(baseDir + Constants.PICTURE_PATH);
	}

	/*
	 * public void uploadImage() {
	 * 
	 * getDriver().findElement(By.cssSelector(
	 * "input[type='file'][class*='choose-image']")).click();
	 * 
	 * // copy the String to the clipboard StringSelection s = new
	 * StringSelection("F:\\chuchu.jpg");
	 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	 * 
	 * // paste the string Robot robot; try { robot = new Robot();
	 * robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	 * robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	 * robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	 * robot.keyPress(java.awt.event.KeyEvent.VK_V);
	 * robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL); waitABit(1000);
	 * robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); } catch (AWTException
	 * e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public void enterCroppingNotes(String notes) {
		element(croppingNotes).waitUntilVisible();
		croppingNotes.type(notes);
	}
	
	public String getPersonalizationCost() {
		element(personalizationCost).waitUntilVisible();
		return personalizationCost.getValue();
	}

	public void hitSaveButton() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}
}
