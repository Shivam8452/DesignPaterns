package com.designPatterns.structural.decoratorattern.CoffeeMachine;

abstract public class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee=coffee;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getDiscription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getCost();
	}
	
	

}
