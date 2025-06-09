package com.RideSharingApp;

abstract public class Vehicle {
	
	protected String numberPlate;
	
	public Vehicle(String numberPlate) {
		this.numberPlate=numberPlate;
	}
	
	abstract public double getFarePerKm();

}
