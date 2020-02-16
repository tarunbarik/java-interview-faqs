package org.string.coding;

public class StringManupulation {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1==s2: " + s1 == s2);// false
		System.out.println("s1.equals(s2): " + s1.equals(s2));

		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
	}// main
}// class
