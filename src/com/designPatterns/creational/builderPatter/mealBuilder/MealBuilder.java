package com.designPatterns.creational.builderPatter.mealBuilder;

public class MealBuilder {
	
	public String mainDish;
	public String sideDish;
	public String drink;
	public String dessert;
	public String appetizer;
	
	public MealBuilder(String mainDish, String sideDish, String drink) {
		this.mainDish =mainDish;
		this.sideDish=sideDish;
		this.drink=drink;
	}
	
	public MealBuilder setDessert(String dessert) {
		this.dessert=dessert;
		return this;
	}
	
	public MealBuilder setAppetizer(String appetizer) {
		this.appetizer=appetizer;
		return this;
	}
	
	public Meal build() {
		 Meal meal = Meal.getInstansce(this);
		 return meal;
	}

}
