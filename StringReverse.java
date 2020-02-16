package org.string.coding;

import java.util.Scanner;

public class StringReverse {
	static public void resv(String input) {
		String result = "";
		int length = 0;
		// find length of entered string
		length = input.length();
		// logic for the reverse
		for (int i = length - 1; i >= 0; i--) {
			result = result + input.charAt(i);
		}
		System.out.println(result);
	}// method

	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		// read inputs
		System.out.println("Enter Any String: ");
		String in = sc.nextLine();
		// method call
		resv(in);
		// close Scanner class object
		sc.close();
	}// main
}// class
