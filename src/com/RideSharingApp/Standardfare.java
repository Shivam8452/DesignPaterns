package com.RideSharingApp;

public class Standardfare implements fareStrategy {

	@Override
	public double calFare(Vehicle vehicle, double distalce) {
		// TODO Auto-generated method stub
		return vehicle.getFarePerKm()*distalce;
	}

}
