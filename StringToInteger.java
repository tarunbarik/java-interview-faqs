package org.string.coding;

public class StringToInteger {

	public static void main(String[] args) {
		String input = "2018";
		int i = Integer.parseInt(input);
		System.out.println(i);

		int x = Integer.valueOf(input);
		System.out.println(x);
	}// main
}// class
