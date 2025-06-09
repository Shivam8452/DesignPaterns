package com.designPatterns.structural.decoratorattern.PizzaOrderingSystem;

public class MashrromDecorator extends PizzaDecorator {

	public MashrromDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	public String getDiscription() {
		return decoratedPizza.getDiscription()+", Mushroom";
	}
	
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedPizza.getCost()+1.5;
	}

}
