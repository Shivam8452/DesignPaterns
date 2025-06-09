package com.designPatterns.behavioural.observerPattern.weatherStation;

public class TVUnit implements Observer {
	
	private String name;
	
	public TVUnit(String name) {
		this.name=name;
	}
	
	public void update(float temp) {
		System.out.println("The temperature in "+name+" device is"+temp);
	}
	

}
