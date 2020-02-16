package org.apps;

import java.util.Scanner;

public class ReverseSentence {
	public void reverse(String input) {
		String[] temp = input.split(" ");
		String result = "";
		for (int i = temp.length - 2; i >= 0; i--) {
			if (i > 0) {
				result += temp[i] + " ";
			} else {
				result += temp[i] + " " + temp[temp.length - 1];
			} // else
		} // for
		System.out.println(result);
	}// method

	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Something: ");
		String input = sc.nextLine();
		new ReverseSentence().reverse(input);
		// close Scanner object
		sc.close();
	}// main

}// class