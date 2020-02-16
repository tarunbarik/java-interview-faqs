package org.app.exp;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public void removeWhiteSpace(String input) {
		char strArray[] = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}//for
		String noSpaceStr = sb.toString();
		System.out.println(noSpaceStr);
	}// method

	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String :");
		String input = sc.nextLine();
		// method call
		new RemoveWhiteSpaces().removeWhiteSpace(input);
		// close Scanner class object
		sc.close();
	}// main

}// class
