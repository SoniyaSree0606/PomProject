package org.execution;

import java.io.IOException;

import org.pagesourceexe.BookingConfirmExe;


public class Execution extends BookingConfirmExe {
	public static void login() {
		username();
		password();
		loginclick1();
	}
	public static void searchHotel() {
		location();
		hotels();
		roomType();
		numOfRoom();
		datePickIn();
		datePickOut();
		numOfAdults();
		searchHotelClick();
		
	}
	public static void selectHotel() {
		buttonClick();
		click3();		
	}
	public static void bookHotel() {
		firstName();
		lastName();
		billingAddress();
		cardNumber();
		cardType();
		cardExpMonth();
		cardExpYear();
		ccvNum();
		click4();
	}
	public static void bookingConfirm() throws IOException {
		bookingId();
		
	}
	

	public static void main(String[] args) throws IOException {
		browserLauch();
		readProperty("url");
		login();
		searchHotel();
		selectHotel();
		bookHotel();
		bookingConfirm();
		
		
		
		
		
	}

}
