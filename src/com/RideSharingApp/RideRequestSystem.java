package com.RideSharingApp;

import java.util.ArrayList;
import java.util.List;

public class RideRequestSystem {
	
	private List<Driver> availDrivers = new ArrayList<>();
	
	public void addDrivers(Driver driver) {
		availDrivers.add(driver);
	}
	
	public void requestRide(Pessanger pessanger, double distance, fareStrategy strategy) throws InterruptedException {
		if(availDrivers.isEmpty()) {
			pessanger.notify("No drivers availabe");
			return;
		}
		
		Driver nearestDriver = findNearest(pessanger.getLoaction());
		
		
		
		Ride ride = new Ride(pessanger, nearestDriver, distance, strategy);
		availDrivers.remove(nearestDriver);
		
		ride.calFare();
		
		pessanger.notify("Ride schedule "+ ride.getFare());
		ride.updateStatus(RideStatus.ONGOING);
		
		Thread.sleep(3000);
		
		ride.updateStatus(RideStatus.COMPLETED);
		
		availDrivers.add(nearestDriver);
		
	}

	private Driver findNearest(Location pessLoaction) {
		// TODO Auto-generated method stub
		Driver nearestDrive = null;
		double minDist = Double.MAX_VALUE;
		
		for(Driver driver:availDrivers) {
			double dist = driver.getLoaction().calDist(pessLoaction);
			if(dist<minDist) {
				minDist=dist;
				nearestDrive=driver;
			}
		}
		
		return nearestDrive;
	}
	

}
