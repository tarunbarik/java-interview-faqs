//ReverseNumber.java
/*Reverse of number means reverse the position of all digits of any number. 
For example reverse of 839 is 938.*/
package org.apps;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// properties
		int no, rev = 0, r;
		Scanner sc = null;
		
		//get Scanner object
		sc= new Scanner(System.in);
		// read inputs
		System.out.println("Enter any number: ");
		no = sc.nextInt();
		//logics to perform reverse of a number
		while (no > 0) {
			r = no % 10;
			rev = rev * 10 + r;
			no = no / 10;
		} // while
		System.out.println("Reverse Number is: " + rev);
		
		//close Scanner object
		sc.close();
	}// main
}// class