package org.pagesourceexe;

public class BookHotelPageExe extends SelectHotelPageExe{
	public static void firstName() {
		data(findEleById(firstName), "FirstName");
	}
	public static void lastName() {
		data(findEleById(lastName), "LastName");
	}
	public static void billingAddress() {
		data(findEleById(billingAddress), "Address");
	}
	public static void cardNumber() {
		data(findEleById(cardNum), "cc_num");
	}
	public static void cardType() {
		data(findEleById(cardType), "cc_type");
	}
	public static void cardExpMonth() {
		data(findEleById(cardExpMonth), "cc_exp_month");
	}
	public static void cardExpYear() {
		data(findEleById(cardExpYear), "cc_exp_year");
	}
	public static void ccvNum() {
		data(findEleById(ccvNum), "cc_cvv");
	}
	public static void click4() {
		click(findEleById(click4));
	}
	
}
