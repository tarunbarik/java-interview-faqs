package org.exception;

public class UseCutomException {

	static public void validate(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException("Invalid");
		} else {
			System.out.println("Welcome to vote");
		}
	}// method

	public static void main(String[] args) {
		try {
			validate(15);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}// main
}// class
