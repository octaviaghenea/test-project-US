package tools.models;

public class ReviewAndPaymentsModel extends ShippingDetailsModel {

	public String paymentMethod;
	public String creditCardNumber;
	public String expirationDate;
	public String expirationYear;
	public String ccvnumber;
	public String comment;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getCcvNumber() {
		return ccvnumber;
	}

	public void setCcvnumber(String ccvnumber) {
		this.ccvnumber = ccvnumber;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
