package com.designPatterns.behavioural.observerPattern.weatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationIn implements Subject {
	
	private float temperature;
	
	private List<Observer> observers;
	
	public WeatherStationIn() {
		observers = new ArrayList();
	}
	
	public void setTemperature(float temp) {
		this.temperature=temp;
		notifyObs();
	}
	
	public void attach(Observer obs) {
		observers.add(obs);
	}
	
	public void detach(Observer obs) {
		observers.remove(obs);
	}
	
	public void notifyObs() {
		for(Observer obs: observers) {
			obs.update(temperature);
		}
	}
	

}
