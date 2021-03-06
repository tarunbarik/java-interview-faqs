package org.app.pattern;

import java.util.Scanner;

/*
A 
A B 
A B C 
A B C D 
A B C D E 
 */
public class APattern1 {

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
		for (int i = 1; i < num; i++) {
			int alphabet = 65; //ASCII value of A
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}
	}// print(-)

}// class
