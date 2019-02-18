package tools.factory;

import tools.models.ProductModel;
import tools.models.ProductPersonalizationModel;
import tools.models.ProductPersonalizationWithPhotoModel;
import tools.utils.RandomGenerators;

public class ProductFactory {
	public static ProductModel getProductInstance() {

		ProductModel product = new ProductModel();

		product.setProductName("name");
		product.setProductSku("PM16260");

		return product;
	}

	public static ProductPersonalizationWithPhotoModel getProductInstanceWithImage() {

		ProductPersonalizationWithPhotoModel product2 = new ProductPersonalizationWithPhotoModel();

		product2.setProductSku("PM3458");
		product2.setEmbraceHeart("Eternal Embrace Heart");
		product2.setEngravingOnHeart("Photo Engraving on Heart Pendant +$29.95");
		product2.setHeartFont("Heart Font Style");
		product2.setScriptFont("Script Font");
		product2.setHeartLine1("Heart Line 1");
		product2.setTextLine1(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));
		product2.setHeartLine2("Heart Line 2");
		product2.setTextLine2(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));
		product2.setPhotoCroppingNotes(RandomGenerators.generateRandomString(100, RandomGenerators.Mode.ALPHA));

		return product2;
	}

	public static ProductPersonalizationModel getProductInstanceWithoutImage() {

		ProductPersonalizationModel product3 = new ProductPersonalizationModel();

		product3.setProductSku("PM16260");
		product3.setPlaqueStyleLabel("Choose Plaque Style");
		product3.setPlaqueStyleOption("Yes, Plaque +$34.95");
		product3.setArtwoorkLabel("Choose Artwork");
		product3.setArtwoorkOption("Paw Prints +$4.95");
		product3.setFontStyleLabel("Choose Font Style");
		product3.setFontStyleOption("Script Font");
		product3.setChooseFrontPoemLabel("Choose Poem");
		product3.setFrontPoemOption("Forever in My Heart +$7.95");
		product3.setNameLabel("Name");
		product3.setNameText(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));
		product3.setSentimentLine1Label("Sentiment Line 1");
		product3.setSentimentLine1Text(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));
		product3.setSentimentLine2Label("Sentiment Line 2");
		product3.setSentimentLine2Text(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));
		product3.setSentimentLine3Label("Sentiment Line 3");
		product3.setSentimentLine3Text(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));
		product3.setChooseBackPoemLabel("Poem Engraving on Back of Urn");
		product3.setBackPoemOption("Never Forget +$14.95");

		return product3;
	}
}
