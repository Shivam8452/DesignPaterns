package com.designPatterns.structural.decoratorattern.PizzaOrderingSystem;

public class PizzaApp {
	public static void main(String[] args) {
		Pizza pizza = new BasePizza();
		
		pizza = new CheeseDecorator(pizza);
		pizza = new MashrromDecorator(pizza);
		
		System.out.println(pizza.getDiscription());
		System.out.println(pizza.getCost());

	}
}
