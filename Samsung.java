package org.app.manhattan;

public class Samsung extends SmartPhone {

	/*
	 * public Samsung(String manufacturer, String operatingSystem, String model,
	 * int cost) { super(manufacturer, operatingSystem, model, cost); }//
	 * constructor
	 */
	@Override
	public String getManufacturer() {
		return "This is Samsung SmartPhone ";
	}

	@Override
	public String getOperatingSystem() {
		return "This Samsung is  having Android OS ";
	}

	@Override
	public String getModel() {
		return "This is Samsung S7 Model";
	}

	@Override
	public int getCost() {
		return 25000;
	}

	@Override
	public String toString() {
		return "Samsung []";
	}

}// class
