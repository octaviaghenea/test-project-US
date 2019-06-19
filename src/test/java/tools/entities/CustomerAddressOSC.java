package tools.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CustomerAddressOSC {

	public String address_book_id;
	public String street_address;
	public String city;
	public String postcode;
	public boolean is_default;

	public String getAddress_book_id() {
		return address_book_id;
	}

	public void setAddress_book_id(String address_book_id) {
		this.address_book_id = address_book_id;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	@Override
	public String toString() {
		return "CustomerAddressOSC [address_book_id=" + address_book_id + ", street_address=" + street_address
				+ ", city=" + city + ", postcode=" + postcode + ", is_default=" + is_default + "]";
	}
}
