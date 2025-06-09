package com.designPatterns.structural.FlyweightPattern.shootingGame;

public class BulletType {
	private String color;
	
	public BulletType(String color) {
		this.color=color;
		System.out.println("Create a bullet with color: "+color);
	}

}
