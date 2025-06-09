package com.designPatterns.structural.decoratorattern.CoffeeMachine;

public class Milk extends CoffeeDecorator {

	public Milk(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	public String getDiscription() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getDiscription()+", milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getCost()+0.5;
	}

}
