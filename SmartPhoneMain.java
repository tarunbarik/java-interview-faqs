package org.app.manhattan;

public class SmartPhoneMain {

	public static void main(String[] args) {
		// create Object of Nokia Mobile
		Nokia nokia = new Nokia();
		// method calls & prints
		System.out.println(nokia.getManufacturer());
		System.out.println(nokia.getModel());
		System.out.println(nokia.getOperatingSystem());
		System.out.println(nokia.getCost());

		// create object of Samsung
		Samsung samsung = new Samsung();
		// method calls
		System.out.println(samsung.getManufacturer());
		System.out.println(samsung.getModel());
		System.out.println(samsung.getOperatingSystem());
		System.out.println(samsung.getCost());
		
	}// main

}// class
