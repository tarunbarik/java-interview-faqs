package org.apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDupChar {

	public static void main(String[] args) throws IOException {
		// properties
		BufferedReader br = null;
		String s = null;
		int length = 0;
		char ch;
		String ans = "";

		// create BufferedReader object
		br = new BufferedReader(new InputStreamReader(System.in));
		// read inputs
		System.out.print("Enter any word : ");
		s = br.readLine();
		// to get length of user entered string
		length = s.length();
		// perform logic
		for (int i = 0; i < length; i++) {
			ch = s.charAt(i);
			if (ch != ' ')
				ans = ans + ch;
			s = s.replace(ch, ' '); // Replacing all occurrence of the current
									// character by a space
		} // for

		System.out.println("Word after removing duplicate characters : " + ans);
	}// main
}// class