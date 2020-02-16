package org.app.pattern;

import java.util.Scanner;
/*
A 
B B 
C C C 
D D D D 
 */
public class APattern4 {
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
				
			}
			System.out.println();
			alphabet++;
		}
	}// print(-)
}// class
