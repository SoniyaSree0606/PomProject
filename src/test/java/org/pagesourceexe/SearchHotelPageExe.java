package org.pagesourceexe;

import org.locators.SearchHotelPageFactory;
import org.locators.SelectHotelPageFactory;

public class SearchHotelPageExe extends LoginPageExe{
	public static void location() {
		data(findEleById(loc), "location");
	}
	public static void hotels() {
		data(findEleById(hotel), "hotels");
	}
	public static void roomType() {
		data(findEleById(roomType), "room_type");
	}
	public static void numOfRoom() {
		data(findEleById(noOfRoom), "room_nos");
	}
	public static void datePickIn() {
		clear(findEleById(datepickInDate));
		data(findEleById(datepickInDate), "datepick_in");
	}
	public static void datePickOut() {
		clear(findEleById(datepickOutDate));
		data(findEleById(datepickOutDate), "datepick_out");
	}
	public static void numOfAdults() {
		data(findEleById(noOfAdults), "adult_room");
	}
	public static void searchHotelClick() {
		click(findEleById(click2));
	}
}
