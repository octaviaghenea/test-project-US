package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.account.LoginSteps;
import steps.header.SearchSteps;
import steps.product.ProductDetailsSteps;
import steps.product.ProductReviewFormSteps;
import tools.factory.ProductFactory;
import tools.factory.ReviewFactory;
import tools.models.ProductModel;
import tools.models.ProductReviewModel;

@RunWith(SerenityRunner.class)

public class ReviewAsGuestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;
	@Steps
	SearchSteps searchSteps;
	@Steps
	ProductDetailsSteps productDetailsSteps;
	@Steps
	ProductReviewFormSteps productReviewFormSteps;

	public ProductModel product;
	public ProductReviewModel review;

	@Before
	public void dataSetup() {
		review = ReviewFactory.getReviewInstance();
		product = ProductFactory.getProductInstance();
		
	}

	@Test
	public void reviewProductAsGuest() {
		loginSteps.openMagentoPage();
		searchSteps.searchProduct(product);
		searchSteps.clickSearchedItem();
		productDetailsSteps.goToReviewsTab();
		productReviewFormSteps.reviewProduct(review);
	}
}
