package com.designPatterns.structural.FlyweightPattern.shootingGame;

import java.util.HashMap;

public class BulletTypeFactory {
	private final static HashMap<String, BulletType> bulletTypes = new HashMap(); 

	public static BulletType getBulletType(String color) {
		if(bulletTypes.get(color)==null) {
			bulletTypes.put(color, new BulletType(color));
		}
		
		return bulletTypes.get(color);
	}
}
