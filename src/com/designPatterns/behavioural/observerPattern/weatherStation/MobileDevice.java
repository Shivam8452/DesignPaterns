package com.designPatterns.behavioural.observerPattern.weatherStation;

public class MobileDevice implements Observer {
    
	
	@Override
	public void update(float temp) {
		// TODO Auto-generated method stub
		System.out.println("The temperature in device is"+temp);

	}
	

}
