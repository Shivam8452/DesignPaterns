package com.designPatterns.behavioural.observerPattern.weatherStation;

public interface Subject {
	
	public void attach(Observer obs);
	
	public void detach(Observer obs);
	
	public void notifyObs();

}
