package com.designPatterns.behavioural.observerPattern.stockMonitoring;

public interface Observer {
	
	public void update(String stockSymbol, double newPrice);

}
