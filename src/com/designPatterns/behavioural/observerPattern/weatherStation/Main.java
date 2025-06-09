package com.designPatterns.behavioural.observerPattern.weatherStation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStationIn weatherStationIn = new WeatherStationIn();
		
		MobileDevice mobile = new MobileDevice();
		TVUnit tv = new TVUnit("Samsung");
		
		weatherStationIn.attach(mobile);
		weatherStationIn.attach(tv);
		
		weatherStationIn.setTemperature(79);
		
		weatherStationIn.detach(mobile);
		
		weatherStationIn.setTemperature(80);

	}

}
