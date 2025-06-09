package com.designPatterns.creational.builderPatter.mealBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meal meal = new MealBuilder("Butter chicken","Naan","Lassi").setDessert("Moong daal halwa").setAppetizer("Sprite").build();
		meal.printMealSummary();
	}

}
