package org.app.manhattan;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
	public static void main(String[] args) {
		String str = "Welcome to Java Technology";
		// here delimiter is space
		String delimiter = " ";
		// list is used to store the words
		List<String> list = new ArrayList<String>();
		int i, start = 0, end = 0;
		for (i = str.indexOf(delimiter); i != -1; i = str.indexOf(delimiter, i + 1)) {
			end = i;
			// by using substring we can get the one word
			list.add(str.substring(start, end));
			start = i;
		} // for

		// this is used to add the last word
		list.add(str.substring(end));
		// print the list
		System.out.println(list);

		// Converting list to array of strings
		String words[] = (String[]) list.toArray(new String[list.size()]);
		for (String word : words) {
			System.out.println(word.trim());
		} // for
	}// main
}// class
