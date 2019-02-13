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

		return product;
	}

	public static ProductModel getProductInstanceWithImage() {

		ProductModel product2 = new ProductModel();

		product2.setProductSku("PM3458");
		product2.setLabelOption("Eternal Embrace Heart");
		product2.setFirstOption("Photo Engraving on Heart Pendant +$29.95");
		product2.setLabelLine("Heart Line 1");
		product2.setSecondOption("Block Font");
		product2.setFirstLine("dfsdfds dfgg df");
		product2.setSecondLine("");
		product2.setCroppingNotes(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");

		return product2;
	}
}
