package com.designPatterns.structural.decoratorattern.CoffeeMachine;

public class Sugar extends CoffeeDecorator {

	public Sugar(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	public String getDiscription() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getDiscription()+",Sugar";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getCost()+1;
	}

}
