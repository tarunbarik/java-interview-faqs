//ReverseString.java
//import java.io.*;
package org.apps;

import java.util.*;

public class ReverseString {
	// Main Method
	public static void main(String[] args) {
		Scanner sc;
		String input = "";
		System.out.println("Enter the input string:");
		try {
			// BufferedReader br = new BufferedReader(new
			// InputStreamReader(System.in));
			// input = br.readLine();
			sc = new Scanner(System.in);
			input = sc.nextLine();

			char[] try1 = input.toCharArray();
			for (int i = try1.length - 1; i >= 0; i--)
				System.out.print(try1[i]);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}// End of main method
}// End of class