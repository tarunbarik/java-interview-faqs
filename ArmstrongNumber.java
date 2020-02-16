package org.app.exp;

import java.util.Scanner;

public class ArmstrongNumber {
	/***
	 * This is the method to find armstrong number logic.
	 * 
	 * @param number
	 */
	public void armstrong(int number) {
		// variable declarations
		int result = 0, temp = 0, value = 0;
		temp = number;
		while (number > 0) {
			value = number % 10;
			number = number / 10;
			result = result + (value * value * value);
		} // while
		if (temp == result)
			System.out.println("It's an Armstrong Number !");
		else
			System.out.println("It's Not an Armstrong Number !");
	}// method

	/***
	 * This is the main method , the starting point of this algorithm.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// get Scanner class object
		Scanner sc = new Scanner(System.in);
		// read inputs
		System.out.println("Enter Any Number :");
		int number = sc.nextInt();
		// method call
		new ArmstrongNumber().armstrong(number);
		// close the Scanner class object
		sc.close();
	}// main
}// class