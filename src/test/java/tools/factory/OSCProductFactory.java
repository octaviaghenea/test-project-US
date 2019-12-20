package tools.factory;

import tools.models.OSCProductModel;

public class OSCProductFactory {

	public static OSCProductModel getOSCProductDetails() {

		OSCProductModel oscProduct = new OSCProductModel();

		oscProduct.setProductName("Always in my heart");
		oscProduct.setProductDescription(
				"Standard chain/cord included. Looking for a custom fit? Make your selection above! Includes a funnel and instructions to fill and seal the cremation pendant.The cremation pendant closes securely with a threaded screw. " + "\n" + "Keep your loved one in your heart always with this beautiful silver stainless steel pendant. This lovely piece of jewelry was created and designed by a professional jeweler. Our jewelers create each piece of cremation jewelry one at a time with a highest level of precision and detail possible. The front is carefully engraved with" + " Always in my heart, " + "while you have the option of adding your own custom engraving to the back. The pendant may be worn or displayed in a glass dome." );

		return oscProduct;
	}

}
