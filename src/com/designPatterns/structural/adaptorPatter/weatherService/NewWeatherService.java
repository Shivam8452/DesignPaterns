package com.designPatterns.structural.adaptorPatter.weatherService;

public class NewWeatherService {
	private String temperature;
    private String condition;
    
    public NewWeatherService(String temperature, String condition) {
    	this.temperature=temperature;
    	this.condition=condition;
    }
	
	public String fetchWeather() {
		// TODO Auto-generated method stub
		return "{\"temperature\": " + temperature + ", \"condition\": \"" + condition + "\"}";
	}
}
