package pages.account;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountNavigationPage extends PageObject {

	@FindBy(css = "ul.nav li:nth-child(6)")
	private WebElementFacade accountInformationLink ;
	
	@FindBy(css = "ul.nav li:nth-child(5)")
	private WebElementFacade addressBookLink;
	
	public void clickAccountInformation(){
		element(accountInformationLink).waitUntilVisible();
		accountInformationLink.click();
	}
	public void clickAddressBook(){
		element(addressBookLink).waitUntilVisible();
		addressBookLink.click();
	}
	
	
}
