package com.designPatterns.behavioural.observerPattern.stockMonitoring;

public interface Subject {
	public void registerObserver(Observer obs);
	
	public void removeObserver(Observer obs);
	
	public void notifyObservers(String stockSymbol, double newPrice);
}
