package org.apps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWords {

	static String reverseWords(String str) {

		Pattern pattern = Pattern.compile("\\s");

		String[] temp = pattern.split(str);
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		} // for
		return result;
	}// method

	public static void main(String[] args) {
		// properties
		String original = "";
		Scanner sc = null;

		// get Scanner object
		sc = new Scanner(System.in);
		// read inputs
		System.out.println("Enter a sentance to reverse:");
		original = sc.nextLine();

		System.out.println(reverseWords(original));

		// close the Scanner object
		sc.close();
	}// main

}// class
