package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class AbstractPage extends PageObject {
	
	public void waitForElementToAppear(final WebElement element, final int noOfSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), noOfSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

	public void waitForElementToAppear(final String cssSelector, final int noOfSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), noOfSeconds);
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.cssSelector(cssSelector))));
    }

	public void waitForLoaderToDissapear(final By cssSelector, final int noOfSeconds) {
		//By loadingImage = By.className("loader");
		WebDriverWait wait = new WebDriverWait(getDriver(), noOfSeconds );
		wait.until(ExpectedConditions.invisibilityOfElementLocated(cssSelector));
	}
}
