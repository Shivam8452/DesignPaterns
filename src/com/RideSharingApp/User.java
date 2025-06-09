package com.RideSharingApp;

public abstract class User {
	protected String name;
	protected String email;
	protected Location location;
	
	public User(String name, String email, Location location) {
		this.name=name;
		this.email=email;
		this.location=location;
	}
	
	public Location getLoaction() {
		return this.location;
	}
	
	public void setLocation(Location location) {
		this.location=location;
	}
	
	abstract public void notify(String msg);

}
