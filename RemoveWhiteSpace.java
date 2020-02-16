package org.app.exp;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public void removeWhiteSpace(String input) {
		String result = " ";
		result = input.trim();
		System.out.println(result);
	}// method

	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String :");
		String input = sc.nextLine();
		// method call
		new RemoveWhiteSpace().removeWhiteSpace(input);
		// close Scanner class object
		sc.close();
	}// main

}// class
