package tools.factory;

import tools.constants.OptionsConstants;
import tools.models.CartModel;
import tools.models.ProductModel;
import tools.productCalculations.ProductCalculations;
import tools.utils.CartCalculations;
import tools.utils.RandomGenerators;
import tools.utils.StringUtils;

public class ProductFactory {

	public static ProductModel getProductInstance() {

		ProductModel product = new ProductModel();

		product.setProductName("name");
		product.setProductSku("PM3458");
		product.setProductPrice("");

		return product;
	}

	public static CartModel getProductInstanceWithImage() {

		CartModel product2 = new CartModel();

		product2.setProductSku("PM3458");
		product2.setProductPrice("179.95");

		product2.setEmbraceHeart("Eternal Embrace Heart");
		product2.setEngravingOnHeart("Photo Engraving on Heart Pendant +$29.95");
		product2.getOptions().put(OptionsConstants.CHOOSE_EMBRACE_HEART,
				StringUtils.cleanStringToNumberOrZeroDefault(product2.getEngravingOnHeart()));

		product2.setHeartFont("Heart Font Style");
		product2.setScriptFont("Script Font");
		product2.getOptions().put(OptionsConstants.CHOOSE_HEART_FONT,
				StringUtils.cleanStringToNumberOrZeroDefault(product2.getHeartFont()));

		product2.setHeartLine1("Heart Line 1");
		product2.setTextLine1(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));

		product2.setHeartLine2("Heart Line 2");
		product2.setTextLine2(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));

		product2.setPhotoCroppingNotes(RandomGenerators.generateRandomString(100, RandomGenerators.Mode.ALPHA));

		product2.setPersonalizationCost(ProductCalculations.calculateProductOptionsTotal(product2.getOptions()));
		product2.setUnitPrice(String.valueOf(ProductCalculations.calculateUnitPrice(product2)));
		product2.setItemSubtotal(String.valueOf(CartCalculations.calculateSubtotal(product2)));

		return product2;
	}

	public static CartModel getProductInstanceWithoutImage() {

		CartModel product3 = new CartModel();

		product3.setProductSku("PM16260");
		product3.setProductPrice("149.95");

		product3.setItemQty("1");

		product3.setPlaqueStyleLabel("Choose Plaque Style");
		product3.setPlaqueStyleOption("Yes, Plaque +$34.95");
		product3.getOptions().put(OptionsConstants.CHOOSE_PLAQUE_STYLE,
				StringUtils.cleanStringToNumberOrZeroDefault(product3.getPlaqueStyleOption()));

		product3.setArtwoorkLabel("Choose Artwork");
		product3.setArtwoorkOption("Paw Prints +$4.95");
		product3.getOptions().put(OptionsConstants.CHOOSE_ARTWORK,
				StringUtils.cleanStringToNumberOrZeroDefault(product3.getArtwoorkOption()));

		product3.setFontStyleLabel("Choose Font Style");
		product3.setFontStyleOption("Script Font");
		product3.getOptions().put(OptionsConstants.CHOOSE_FONT_STYLE,
				StringUtils.cleanStringToNumberOrZeroDefault(product3.getFontStyleOption()));

		product3.setChooseFrontPoemLabel("Choose Poem");
		product3.setFrontPoemOption("Forever in My Heart +$7.95");
		product3.getOptions().put(OptionsConstants.CHOOSE_FRONT_POEM,
				StringUtils.cleanStringToNumberOrZeroDefault(product3.getFrontPoemOption()));

		product3.setNameLabel("Name");
		product3.setNameText(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));

		product3.setSentimentLine1Label("Sentiment Line 1");
		product3.setSentimentLine1Text(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));

		product3.setSentimentLine2Label("Sentiment Line 2");
		product3.setSentimentLine2Text(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));

		product3.setSentimentLine3Label("Sentiment Line 3");
		product3.setSentimentLine3Text(RandomGenerators.generateRandomString(20, RandomGenerators.Mode.ALPHA));

		product3.setChooseBackPoemLabel("Poem Personalization on Back of Urn");
		product3.setBackPoemOption("Never Forget +$14.95");
		product3.getOptions().put(OptionsConstants.CHOOSE_BACK_POEM,
				StringUtils.cleanStringToNumberOrZeroDefault(product3.getBackPoemOption()));

		product3.setPersonalizationCost(ProductCalculations.calculateProductOptionsTotal(product3.getOptions()));
		product3.setUnitPrice(String.valueOf(ProductCalculations.calculateUnitPrice(product3)));
		product3.setItemSubtotal(String.valueOf(CartCalculations.calculateSubtotal(product3)));

		return product3;
	}

	public static CartModel updateInstance(CartModel cartModel) {
		cartModel.setPersonalizationCost(ProductCalculations.calculateProductOptionsTotal(cartModel.getOptions()));
		cartModel.setUnitPrice(String.valueOf(ProductCalculations.calculateUnitPrice(cartModel)));
		cartModel.setItemSubtotal(String.valueOf(CartCalculations.calculateSubtotal(cartModel)));
		return cartModel;
	}
}
