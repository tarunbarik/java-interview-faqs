package org.app.pattern;

import java.util.Scanner;
/*
A 
B C 
D E F 
G H I J 
K L M N O 
 */
public class APattern2 {
	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		// read inputs
		System.out.println("Enter Any Number:");
		int num = sc.nextInt();
		// method call
		print(num);
		// close Scanner class object
		sc.close();
	}// main

	private static void print(int num) {
		int alphabet = 65;
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}
	}// print(-)
}// class
