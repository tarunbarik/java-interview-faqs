package org.app.pattern;

import java.util.Scanner;

/*
A
B A
C B A
D C B A
 */
public class APattern5 {
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
		for (int i = 0; i < num; i++) {
			for (int j = 0, k = i; j <= i; j++, --k)
				System.out.print((char) ('A' + k)+" ");
			System.out.print("\n");
		}
	}// print(-)
}// class
