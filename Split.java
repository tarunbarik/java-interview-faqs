package org.app.manhattan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// get List object
		List<String> pieces = new ArrayList<String>();
		// get Scanner object
		Scanner sc = new Scanner(System.in);
		// read inputs
		String input = sc.nextLine().trim();
		System.out.println("Input :" + input);
		// logic
		char ch = 's';
		int startIndex = 0;
		int matchIndex = -999;
		while ((matchIndex = input.indexOf(ch)) != -1) {
			pieces.add(input.substring(startIndex, matchIndex));
			System.out.print(input.substring(startIndex, matchIndex));
			input = input.substring(matchIndex + 1);
			System.out.print("Next String :" + input);
			System.out.println();
		}
		// prints
		System.out.println(input);
		// add input
		pieces.add(input);
		System.out.println("Pieces : " + pieces);
	}// main

}// class