package org.string.coding;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		// read inputs
		System.out.print("Enter First String: ");
		String s1 = sc.next();
		System.out.print("Enter Second String: ");
		String s2 = sc.next();
		System.out.println("Before Swapping: ");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		// swapping starts
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		// swapping ends
		System.out.println("After Swapping: ");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		// close Scanner class object
		sc.close();
	}// main
}// class
