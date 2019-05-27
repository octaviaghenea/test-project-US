package steps.checkout;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.checkout.ShoppingCartPage;
import tools.models.CartModel;
import tools.utils.CartCalculations;

public class CartSteps {
	
	ShoppingCartPage shoppingCartPage;
	
//	public void verifyPageTitle() {
//		String actualTitle = getDriver().getTitle();
//		String expectedTitle = "Shopping Cart";
//		System.out.println("Actual title: " + actualTitle);
//		Assert.assertTrue("Page name not correct: " + expectedTitle + " Actual page title: " + actualTitle,
//				expectedTitle.contentEquals(actualTitle));
//	}
	
	public void verifyProduct() {
		
		System.out.println("Actual");
		
		List<CartModel> expectedProductList = shoppingCartPage.grabProductsList() ;
		for (CartModel cartModel : expectedProductList) {
			System.out.println("---------------");
			System.out.println(cartModel);
		}
//		String actualProduct = 
		//Assert.assertTrue("Product not correct: " + expectedProduct + "Actual product: " + actualProduct, expectedProduct.equals(actualProduct));
	}
	
	public void verifySubtotalPrice(CartModel product) {
		
		//sString actualCost = shoppingCartPage.
		String expectedCost = CartCalculations.calculateSubtotal(product).toString();
		System.out.println("Subtotal is: " + expectedCost);
	}
}
