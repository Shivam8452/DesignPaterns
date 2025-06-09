package com.designPatterns.structural.decoratorattern.CoffeeMachine;

public class BasicCoffee implements Coffee {

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "Basic Coffee";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4.0;
	}
	

}
