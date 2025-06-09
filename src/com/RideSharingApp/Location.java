package com.RideSharingApp;

public class Location {
	
	private double lat;
	private double log;
	
	public Location(double lat, double log) {
		this.lat=lat;
		this.log=log;
	}
	
	public double getLongitude() {
		return this.log;
	}
	
	public double getLatitude() {
		return this.lat;
	}
	
	public double calDist(Location two) {
		double dx = this.lat-two.lat;
		double dy = this.log - two.log;
		
		return Math.sqrt(dx*dx+dy*dy);
	}
}
