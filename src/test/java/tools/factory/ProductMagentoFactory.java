package tools.factory;

import java.util.ArrayList;
import java.util.List;

import tools.entities.product.CategoryLinks;
import tools.entities.product.CustomAttributes;
import tools.entities.product.ExtensionAttributes;
import tools.entities.product.OptionValues;
import tools.entities.product.Options;
import tools.entities.product.Product;
import tools.entities.product.ProductModel;
import tools.entities.product.StockItem;

public class ProductMagentoFactory {

	public static ProductModel getMagentoProductInstance() {

		ProductModel productModel = new ProductModel();

		Product product = new Product();
		StockItem stock = new StockItem();
		ExtensionAttributes extentionAttribute = new ExtensionAttributes();
		List<String> websiteIDs = new ArrayList<String>();
		List<CategoryLinks> categoryLinks = new ArrayList<CategoryLinks>();
		List<CustomAttributes> customAttributes = new ArrayList<CustomAttributes>();
		List<Options> options = new ArrayList<Options>();

		productModel.setProduct(product);
		product.setId("1000");
		product.setSku("Test011");
		product.setName("Test Product AutomationAPI");
		product.setAttribute_set_id("9");
		product.setPrice("65.69");
		product.setStatus("2");
		product.setVisibility("4");
		product.setType_id("simple");
		product.setCreated_at("2019-09-13 15:51:05");
		product.setUpdated_at("2019-10-23 13:46:45");
		product.setWeight("5");

		product.setExtension_attributes(extentionAttribute);
		product.setOptions(options);
		product.setCustom_attributes(customAttributes);

		stock.setProduct_id(1000);
		stock.setStock_id("1");
		stock.setQty("9999");
		stock.setIs_in_stock(true);
		stock.setIs_qty_decimal(false);
		stock.setShow_default_notification_message(false);
		stock.setUse_config_min_qty(true);
		stock.setMin_qty("1");
		stock.setUse_config_min_sale_qty("1");
		stock.setMin_sale_qty("1");
		stock.setUse_config_max_sale_qty(true);
		stock.setMax_sale_qty("1000");
		stock.setUse_config_backorders(true);
		stock.setBackorders("0");
		stock.setUse_config_notify_stock_qty(true);
		stock.setNotify_stock_qty("1");
		stock.setUse_config_qty_increments(true);
		stock.setQty_increments("0");
		stock.setUse_config_enable_qty_inc(true);
		stock.setEnable_qty_increments(false);
		stock.setUse_config_manage_stock(true);
		stock.setManage_stock(true);
		stock.setIs_decimal_divided(false);
		stock.setStock_status_changed_auto("0");

		websiteIDs.add("1");

		CategoryLinks firstCategory = new CategoryLinks();
		firstCategory.setCategory_id("49");
		firstCategory.setPosition("1");

		CategoryLinks secondCategory = new CategoryLinks();
		secondCategory.setCategory_id("50");
		secondCategory.setPosition("35");

		categoryLinks.add(firstCategory);
		categoryLinks.add(secondCategory);

		extentionAttribute.setCategory_links(categoryLinks);
		extentionAttribute.setStock_item(stock);
		extentionAttribute.setWebsite_ids(websiteIDs);

		CustomAttributes themeAttribute = new CustomAttributes();
		themeAttribute.setAttribute_code("mt_theme");
		themeAttribute.setValue("103");

		CustomAttributes colorAttribute = new CustomAttributes();
		colorAttribute.setAttribute_code("mt_color");
		colorAttribute.setValue("563");

		CustomAttributes isFeaturedAttribute = new CustomAttributes();
		isFeaturedAttribute.setAttribute_code("pm_featured");
		isFeaturedAttribute.setValue("1");

		customAttributes.add(themeAttribute);
		customAttributes.add(colorAttribute);
		customAttributes.add(isFeaturedAttribute);

		List<OptionValues> firstOptionValues = new ArrayList<OptionValues>();

		Options firstOption = new Options();
		firstOption.setProduct_sku("Test011");
		firstOption.setTitle("Choose first option");
		firstOption.setType("drop_down");
		firstOption.setSort_order("1");
		firstOption.setIs_require(false);
		firstOption.setValues(firstOptionValues);

		OptionValues firstOptionValue = new OptionValues();
		OptionValues firstOptionValue2 = new OptionValues();

		firstOptionValue.setTitle("No, first Option");
		firstOptionValue.setSort_order("1");
		firstOptionValue.setPrice("0");
		firstOptionValue.setPrice_type("fixed");

		firstOptionValue2.setTitle("Yes, first Option");
		firstOptionValue2.setSort_order("2");
		firstOptionValue2.setPrice("23.65");
		firstOptionValue2.setPrice_type("fixed");

		firstOptionValues.add(firstOptionValue);
		firstOptionValues.add(firstOptionValue2);
		options.add(firstOption);

		List<OptionValues> secondOptionValues = new ArrayList<OptionValues>();

		Options secondOption = new Options();
		secondOption.setProduct_sku("Test011");
		secondOption.setTitle("Choose second option");
		secondOption.setType("drop_down");
		secondOption.setSort_order("2");
		secondOption.setIs_require(false);
		secondOption.setValues(secondOptionValues);

		OptionValues secondOptionValue = new OptionValues();
		OptionValues secondOptionValue2 = new OptionValues();

		secondOptionValue.setTitle("No second option");
		secondOptionValue.setSort_order("1");
		secondOptionValue.setPrice("0");
		secondOptionValue.setPrice_type("fixed");

		secondOptionValue2.setTitle("Yes, second option");
		secondOptionValue2.setSort_order("2");
		secondOptionValue2.setPrice("23.65");
		secondOptionValue2.setPrice_type("fixed");

		secondOptionValues.add(secondOptionValue);
		secondOptionValues.add(secondOptionValue2);
		options.add(secondOption);

		List<OptionValues> poemValues = new ArrayList<OptionValues>();

		Options thirdOptionPoem = new Options();
		thirdOptionPoem.setProduct_sku("Test011");
		thirdOptionPoem.setTitle("Choose Poem");
		thirdOptionPoem.setType("drop_down");
		thirdOptionPoem.setSort_order("3");
		thirdOptionPoem.setIs_require(false);
		thirdOptionPoem.setValues(poemValues);

		OptionValues firstPoemValue = new OptionValues();
		OptionValues secondPoemValue = new OptionValues();
		OptionValues thirdPoemValue = new OptionValues();
		OptionValues fourthPoemValue = new OptionValues();
		OptionValues fifthPoemValue = new OptionValues();
		OptionValues sixthPoemValue = new OptionValues();

		firstPoemValue.setTitle("No Poem");
		firstPoemValue.setSort_order("1");
		firstPoemValue.setPrice("0");
		firstPoemValue.setPrice_type("fixed");

		secondPoemValue.setTitle("If Tears Could Build a Stairway");
		secondPoemValue.setSort_order("2");
		secondPoemValue.setPrice("4.95");
		secondPoemValue.setPrice_type("fixed");

		thirdPoemValue.setTitle("Butterflies to Heaven");
		thirdPoemValue.setSort_order("3");
		thirdPoemValue.setPrice("4.95");
		thirdPoemValue.setPrice_type("fixed");

		fourthPoemValue.setTitle("Forever in My Heart");
		fourthPoemValue.setSort_order("4");
		fourthPoemValue.setPrice("4.95");
		fourthPoemValue.setPrice_type("fixed");

		fifthPoemValue.setTitle("When Someone You Love");
		fifthPoemValue.setSort_order("5");
		fifthPoemValue.setPrice("4.95");
		fifthPoemValue.setPrice_type("fixed");

		sixthPoemValue.setTitle("No Farewell Words");
		sixthPoemValue.setSort_order("6");
		sixthPoemValue.setPrice("4.95");
		sixthPoemValue.setPrice_type("fixed");

		poemValues.add(firstPoemValue);
		poemValues.add(secondPoemValue);
		poemValues.add(thirdPoemValue);
		poemValues.add(fourthPoemValue);
		poemValues.add(fifthPoemValue);
		poemValues.add(sixthPoemValue);
		options.add(thirdOptionPoem);

		Options fourthOption = new Options();
		fourthOption.setProduct_sku("Test011");
		fourthOption.setTitle("Engraving Option");
		fourthOption.setType("field");
		fourthOption.setSort_order("4");
		fourthOption.setIs_require(false);
		fourthOption.setPrice("0");
		fourthOption.setPrice_type("fixed");
		fourthOption.setMax_characters("50");

		options.add(fourthOption);

		return productModel;
	}
}
