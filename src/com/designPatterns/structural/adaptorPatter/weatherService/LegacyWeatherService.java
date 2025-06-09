package com.designPatterns.structural.adaptorPatter.weatherService;

public class LegacyWeatherService implements WeatherService {
	private String temperature;
    private String condition;
    
    public LegacyWeatherService(String temperature, String condition) {
    	this.temperature=temperature;
    	this.condition=condition;
    }
	@Override
	public String getWeatherData() {
		// TODO Auto-generated method stub
		return "<weather><temperature>" + temperature + "</temperature><condition>" + condition + "</condition></weather>";
	}

}
