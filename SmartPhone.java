package org.app.manhattan;

public class SmartPhone {
	// properties
	private String manufacturer;
	private String operatingSystem;
	public String model;
	private int cost;

	/*
	 * public SmartPhone(String manufacturer, String operatingSystem, String
	 * model, int cost) { this.manufacturer = manufacturer; this.operatingSystem
	 * = operatingSystem; this.model = model; this.cost = cost; }// constructor
	 */
	// setter & getter methods
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "SmartPhone [manufacturer=" + manufacturer + ", operatingSystem=" + operatingSystem + ", model=" + model
				+ ", cost=" + cost + "]";
	}

}// class
