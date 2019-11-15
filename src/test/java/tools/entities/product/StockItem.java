package tools.entities.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class StockItem {

	private int product_id;
	private String stock_id;
	private String qty;
	private boolean is_in_stock;
	private boolean is_qty_decimal;
	private boolean show_default_notification_message;
	private boolean use_config_min_qty;
	private String min_qty;
	private String use_config_min_sale_qty;
	private String min_sale_qty;
	private boolean use_config_max_sale_qty;
	private String max_sale_qty;
	private boolean use_config_backorders;
	private String backorders;
	private boolean use_config_notify_stock_qty;
	private String notify_stock_qty;
	private boolean use_config_qty_increments;
	private String qty_increments;
	private boolean use_config_enable_qty_inc;
	private boolean enable_qty_increments;
	private boolean use_config_manage_stock;
	private boolean manage_stock;
	// low_stock_date;
	private boolean is_decimal_divided;
	private String stock_status_changed_auto;



	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getStock_id() {
		return stock_id;
	}

	public void setStock_id(String stock_id) {
		this.stock_id = stock_id;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public boolean isIs_in_stock() {
		return is_in_stock;
	}

	public void setIs_in_stock(boolean is_in_stock) {
		this.is_in_stock = is_in_stock;
	}

	public boolean isIs_qty_decimal() {
		return is_qty_decimal;
	}

	public void setIs_qty_decimal(boolean is_qty_decimal) {
		this.is_qty_decimal = is_qty_decimal;
	}

	public boolean isShow_default_notification_message() {
		return show_default_notification_message;
	}

	public void setShow_default_notification_message(boolean show_default_notification_message) {
		this.show_default_notification_message = show_default_notification_message;
	}

	public boolean isUse_config_min_qty() {
		return use_config_min_qty;
	}

	public void setUse_config_min_qty(boolean use_config_min_qty) {
		this.use_config_min_qty = use_config_min_qty;
	}

	public String getMin_qty() {
		return min_qty;
	}

	public void setMin_qty(String min_qty) {
		this.min_qty = min_qty;
	}

	public String isUse_config_min_sale_qty() {
		return use_config_min_sale_qty;
	}

	public void setUse_config_min_sale_qty(String use_config_min_sale_qty) {
		this.use_config_min_sale_qty = use_config_min_sale_qty;
	}

	public String getMin_sale_qty() {
		return min_sale_qty;
	}

	public void setMin_sale_qty(String min_sale_qty) {
		this.min_sale_qty = min_sale_qty;
	}

	public boolean isUse_config_max_sale_qty() {
		return use_config_max_sale_qty;
	}

	public void setUse_config_max_sale_qty(boolean use_config_max_sale_qty) {
		this.use_config_max_sale_qty = use_config_max_sale_qty;
	}

	public String getMax_sale_qty() {
		return max_sale_qty;
	}

	public void setMax_sale_qty(String max_sale_qty) {
		this.max_sale_qty = max_sale_qty;
	}

	public boolean getUse_config_backorders() {
		return use_config_backorders;
	}

	public void setUse_config_backorders(boolean use_config_backorders) {
		this.use_config_backorders = use_config_backorders;
	}

	public String getBackorders() {
		return backorders;
	}

	public void setBackorders(String backorders) {
		this.backorders = backorders;
	}

	public boolean getUse_config_notify_stock_qty() {
		return use_config_notify_stock_qty;
	}

	public void setUse_config_notify_stock_qty(boolean use_config_notify_stock_qty) {
		this.use_config_notify_stock_qty = use_config_notify_stock_qty;
	}

	public String getNotify_stock_qty() {
		return notify_stock_qty;
	}

	public void setNotify_stock_qty(String notify_stock_qty) {
		this.notify_stock_qty = notify_stock_qty;
	}

	public boolean isUse_config_qty_increments() {
		return use_config_qty_increments;
	}

	public void setUse_config_qty_increments(boolean use_config_qty_increments) {
		this.use_config_qty_increments = use_config_qty_increments;
	}

	public String getQty_increments() {
		return qty_increments;
	}

	public void setQty_increments(String qty_increments) {
		this.qty_increments = qty_increments;
	}

	public boolean isUse_config_enable_qty_inc() {
		return use_config_enable_qty_inc;
	}

	public void setUse_config_enable_qty_inc(boolean use_config_enable_qty_inc) {
		this.use_config_enable_qty_inc = use_config_enable_qty_inc;
	}

	public boolean isEnable_qty_increments() {
		return enable_qty_increments;
	}

	public void setEnable_qty_increments(boolean enable_qty_increments) {
		this.enable_qty_increments = enable_qty_increments;
	}

	public boolean isUse_config_manage_stock() {
		return use_config_manage_stock;
	}

	public void setUse_config_manage_stock(boolean use_config_manage_stock) {
		this.use_config_manage_stock = use_config_manage_stock;
	}

	public boolean isManage_stock() {
		return manage_stock;
	}

	public void setManage_stock(boolean manage_stock) {
		this.manage_stock = manage_stock;
	}

	public boolean isIs_decimal_divided() {
		return is_decimal_divided;
	}

	public void setIs_decimal_divided(boolean is_decimal_divided) {
		this.is_decimal_divided = is_decimal_divided;
	}

	public String getStock_status_changed_auto() {
		return stock_status_changed_auto;
	}

	public void setStock_status_changed_auto(String stock_status_changed_auto) {
		this.stock_status_changed_auto = stock_status_changed_auto;
	}

}
