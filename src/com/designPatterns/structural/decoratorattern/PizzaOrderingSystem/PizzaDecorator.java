package com.designPatterns.structural.decoratorattern.PizzaOrderingSystem;

abstract public class PizzaDecorator implements Pizza {
	
	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.decoratedPizza=pizza;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return decoratedPizza.getDiscription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedPizza.getCost();
	}

}
