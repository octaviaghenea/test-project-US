package tools.factory;

import tools.models.ProductModel;

public class ProductFactory {
	
	public static ProductModel getProductInstance() {
		
		ProductModel product = new ProductModel();
		product.setProductName("name");
		product.setProductSku("PM16260");
		product.setFirstOption("Yes, Plaque +$34.95");
		product.setSecondOption("Hearts +$4.95");
		product.setThirdOption("Script Font");
		product.setFirstPoem("Never Forget +$7.95");
		product.setFirstLine("fdsfds");
		product.setSecondLine("wtdfgdfg");
		product.setThirdLine("dgdlkdjjds dhfgdhf");
		product.setFourthLine("dfdsgdf dgfgdf gdf");
		product.setSecondPoem("Those We Have Held +$14.95");
		/*product.setCroppingNotes(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");*/
		
		return product;
	}

}
