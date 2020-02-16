package org.apps;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		//properties
		int a=0, b=0, c=0;
		Scanner sc = null;
		
		//get Scanner object
		sc = new Scanner(System.in);
		//read inputs
		System.out.println("Enter Value in a :");
		a = sc.nextInt();
		System.out.println("Enter Value in b :");
		b = sc.nextInt();
		
		/* Swapping Logic  using third variable */
	/*	c = a;
		a = b;
		b = c;
		System.out.println("Values in a:" + a);
		System.out.println("Values in b:" + b);
		*/
		
		/* Swapping logic without using third variable */
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Values in a:" + a);
		System.out.println("Values in b:" + b);
		
		//close Scanner object
		sc.close();
	}// main
}// class