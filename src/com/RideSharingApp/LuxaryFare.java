package com.RideSharingApp;

public class LuxaryFare implements fareStrategy {

	@Override
	public double calFare(Vehicle vehicle, double distalce) {
		// TODO Auto-generated method stub
		return vehicle.getFarePerKm()*distalce*1.5;
	}

}
