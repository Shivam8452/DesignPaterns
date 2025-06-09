package com.designPatterns.structural.adaptorPatter.weatherService;

public class NewWeatherServiceAdapter implements WeatherService{
	private NewWeatherService weatherService;
	
	public NewWeatherServiceAdapter(NewWeatherService weatherService) {
		this.weatherService=weatherService;
	}
	@Override
	public String getWeatherData() {
		// TODO Auto-generated method stub
		return weatherService.fetchWeather();
	}

}
