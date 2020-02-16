/* Convert a given string as "10/7/2016" to a Date object. */

package org.apps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = null;
		String dateString = null;
		Date date = null;

		sdf = new SimpleDateFormat("dd/MM/yyyy");
		dateString = "10/07/2016";
		date = sdf.parse(dateString);
		System.out.println("Date is:------->"+date);

	}// main
}// class
