package steps.header;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;
import pages.search.SearchListPage;
import pages.search.SearchPage;
import tools.models.ProductModel;

public class SearchSteps {

	SearchPage searchPage;
	SearchListPage searchListPage;

	@Title ("Search For Product")
	@Step
	public void searchProduct(ProductModel product) {
		searchPage.seachForProduct(product.getProductSku());
	}
	
	@Step
	public void clickSearchedItem() {
		searchListPage.clickSearchedItem();
	}

}
