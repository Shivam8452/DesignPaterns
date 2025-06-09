package com.designPatterns.structural.FlyweightPattern.shootingGame;

public class Bullet {
	private BulletType type;
	
	private int x,y;
	
	private int velocity;
	
	public Bullet(String color, int x, int y, int velocity) {
		type = BulletTypeFactory.getBulletType(color);
		this.x=x;
		this.y=y;
		this.velocity=velocity;
		
		System.out.println("Create a bullet with color "+color+"position ("+x+","+y+") velocity "+velocity);
	}
	

}
