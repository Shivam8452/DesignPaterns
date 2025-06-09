package com.RideSharingApp;

enum RideStatus{
	SCHEDULED,ONGOING,COMPLETED;
}

public class Ride {
	private Pessanger pessanger;
	private Driver driver;
	private double distance;
	private fareStrategy strategy;
	private RideStatus status;
	private double fare;
	
	public Ride(Pessanger pessanger, Driver driver, double distance, fareStrategy strategy) {
		this.pessanger=pessanger;
		this.driver=driver;
		this.distance=distance;
		this.strategy=strategy;
		this.status=RideStatus.SCHEDULED;
	}
	
	public void calFare() {
		this.fare=strategy.calFare(driver.getVehicle(), distance);
	}
	
	public void updateStatus(RideStatus status) {
		this.status=status;
		notifyUser("Updated status"+status);
		
	}
	
	private void notifyUser(String msg) {
		pessanger.notify(msg);
		driver.notify(msg);
	}
	
	public double getFare() {
		return this.fare;
	}
}
