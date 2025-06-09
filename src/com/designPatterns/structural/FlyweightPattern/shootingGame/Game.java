package com.designPatterns.structural.FlyweightPattern.shootingGame;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			Bullet bullet = new Bullet("Red", i*10,i*20,5);
		}
		
		for(int i=0;i<5;i++) {
			Bullet bullet = new Bullet("Green", i*10,i*20,5);
		}
	}

}
