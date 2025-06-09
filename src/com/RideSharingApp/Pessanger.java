package com.RideSharingApp;

public class Pessanger extends User {

	public Pessanger(String name, String email, Location location) {
		super(name, email, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notify(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Passenger "+msg);
	}

}
