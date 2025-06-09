package com.designPatterns.structural.decoratorattern.PizzaOrderingSystem;

public class BasePizza implements Pizza {
	

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "Basic Pizza";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
