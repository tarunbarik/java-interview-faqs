package org.app.manhattan;

public class StringToNumber {
	public static int convertStringToInt(String str) {
		char[] ch = str.toCharArray();
		int sum = 0;
		// get ASCII value for zero
		int zeroAscii = (int) '0';
		for (char c : ch) {
			int tempAscii = (int) c;
			sum = (sum * 10) + (tempAscii - zeroAscii);
		}
		return sum;
	}// method

	public static void main(String[] args) {
		System.out.println("\"3256\" == " + convertStringToInt("3256"));
		System.out.println("\"76289\" == " + convertStringToInt("76289"));
		System.out.println("\"90087\" == " + convertStringToInt("90087"));
	}// main

}// class
