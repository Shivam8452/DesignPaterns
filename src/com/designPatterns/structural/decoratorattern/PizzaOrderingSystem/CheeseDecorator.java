package com.designPatterns.structural.decoratorattern.PizzaOrderingSystem;

public class CheeseDecorator extends PizzaDecorator {
	
	public CheeseDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String getDiscription() {
		return decoratedPizza.getDiscription()+", Cheese";
	}
	
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedPizza.getCost()+0.5;
	}

}
