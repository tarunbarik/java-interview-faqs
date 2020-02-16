/* Java example program to remove all vowels from a String*/
package org.apps;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		/*
		 * String str = "RemoveVowels"; String removestr =
		 * str.replaceAll("[aeiouAEIOU]", " "); System.out.println(removestr);
		 */

		// properties
		Scanner scanner = null;
		String str = null, removestr = null;

		// get Scanner object/create Scanner object
		scanner = new Scanner(System.in);
		// read inputs
		str = scanner.nextLine();
		removestr = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(removestr);

		//close scanner object
		scanner.close();
	}// main
}// class