package com.RideSharingApp;

public class Driver extends User {
	
	private Vehicle vehicle;

	public Driver(String name, String email, Location location, Vehicle vehicle) {
		super(name, email, location);
		// TODO Auto-generated constructor stub
		this.vehicle=vehicle;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	@Override
	public void notify(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Driver "+msg);
	}
	
	

}
