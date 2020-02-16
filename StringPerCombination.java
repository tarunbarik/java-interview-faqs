package org.app.exp;

import java.util.Scanner;

public class StringPerCombination {
	public static void percombination(String input) {
		percombination(" ", input);
	}// method

	private static void percombination(String perm, String word) {
		if (word.isEmpty()) {
			System.out.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				percombination(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			} // for
		} // else
	}// method

	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		// read inputs
		String output = sc.nextLine();
		// method call
		percombination(output);
		// close Scanner class object
		sc.close();
	}// main

}// class
