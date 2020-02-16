package org.app.exp;

import java.util.Scanner;

public class RemoveDuplicateChars {
	public void removeDuplicateChars(String input) {
		// properties
		int length = 0;
		char ch;
		String result = "";

		// find length of the string
		length = input.length();
		for (int i = 0; i < length; i++) {
			ch = input.charAt(i);
			if (ch != ' ') {
				result = result + ch;
				input = input.replace(ch, ' ');
			} // if
		} // for
		System.out.println(result);
	}// method

	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String :");
		String input = sc.nextLine();
		// method call
		new RemoveDuplicateChars().removeDuplicateChars(input);
		// close Scanner class object
		sc.close();
	}// main

}// class
