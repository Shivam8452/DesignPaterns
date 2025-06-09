package com.designPatterns.creational.builderPatter.mealBuilder;

public class Meal {
	
	private String mainDish;
	private String sideDish;
	private String drink;
	private String dessert;
	private String appetizer;
	
	private Meal(MealBuilder mealBuilder) {
		this.mainDish =mealBuilder.mainDish;
		this.sideDish=mealBuilder.sideDish;
		this.drink=mealBuilder.drink;
		this.dessert=mealBuilder.dessert;
		this.appetizer=mealBuilder.appetizer;

	}
	
	public static Meal getInstansce(MealBuilder builder) {
		Meal meal = new Meal(builder);
		return meal;
	}
	
	 public void printMealSummary() {
	        System.out.println("Main Dish: " + mainDish);
	        System.out.println("Side Dish: " + sideDish);
	        System.out.println("Drink: " + drink);
	        System.out.println("Dessert: " + dessert);
	        System.out.println("Appetizer: " + appetizer);
	    }

}
