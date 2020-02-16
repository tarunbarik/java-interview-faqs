package org.apps;

import java.util.*;

public class ReverseString1{
	public static void main(String args[]) {
		//properties
		String original, reverse = "";
		Scanner sc = null;
		int length =0;
		
		//get Scanner object
		sc = new Scanner(System.in);
		//read inputs
		System.out.println("Enter a string to reverse:");
		original = sc.nextLine();
		//find length of user entered string
		length =  original.length();
		//logic to reverse the string
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		} // for
		System.out.println("Reverse of entered string is: " + reverse);
		
		//close objs
		sc.close();
	}// main
}// class