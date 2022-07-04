package org.pagesourceexe;


import org.locators.BookingConfirmPageFactory;


public class LoginPageExe extends BookingConfirmPageFactory{

	public static void username() {
		data(findEleById(name), "adactinusername");
	}
	public static void password() {
		data(findEleById(pass), "adactinpassword");
	}
	public static void loginclick1() {
		click(findEleById(click1));
	}
}
