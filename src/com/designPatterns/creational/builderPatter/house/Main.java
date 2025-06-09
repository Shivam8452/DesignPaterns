package com.designPatterns.creational.builderPatter.house;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House.HouseBuilder("Concrete", "roof", "Wood")
				.setHasGarage(true)
				.setHaspool(true).build();
		
		System.out.println(house);
	}

}
