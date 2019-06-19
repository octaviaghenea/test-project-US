package tools.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class CustomerAddressArrayOSC {

	List<CustomerAddressOSC> addressList;

	public List<CustomerAddressOSC> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<CustomerAddressOSC> addressList) {
		this.addressList = addressList;
	}
}
