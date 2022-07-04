package org.pagesourceexe;

import java.io.IOException;

public class BookingConfirmExe extends BookHotelPageExe{
	public static void bookingId() throws IOException {
		getValue(findEleById(bookingNum), "value");
		Screenshot();
		
	}
}
