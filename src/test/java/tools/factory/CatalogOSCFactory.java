package tools.factory;

import tools.entities.CatalogOSC;
import tools.utils.RandomGenerators;

public class CatalogOSCFactory {

	public static CatalogOSC getOSCProductDetails() {

		CatalogOSC product = new CatalogOSC();

		product.setId("5025");
		product.setName(RandomGenerators.generateRandomString(10, RandomGenerators.Mode.ALPHA));
		product.setPrice(RandomGenerators.generateRandomString(2, RandomGenerators.Mode.NUMERIC));

		return product;
	}
}
