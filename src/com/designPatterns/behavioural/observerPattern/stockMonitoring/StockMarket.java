package com.designPatterns.behavioural.observerPattern.stockMonitoring;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
	
	private final List<Observer> observers;
    private final double priceChangeThreshold;
    
    public StockMarket(double priceChangeThreshold) {
    	observers = new ArrayList();
    	this.priceChangeThreshold=priceChangeThreshold;
    }
    
    public void registerObserver(Observer o) {
    	observers.add(o);
    }
    
    public void removeObserver(Observer o) {
    	observers.remove(o);
    }

	@Override
	public void notifyObservers(String stockSymbol, double newPrice) {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(stockSymbol, newPrice);
		}
		
	}
	public void setStockPrice(String stockSymbol, double newPrice, double oldPrice) {
		double priceChange = Math.abs(oldPrice-newPrice)/100;
		
		if(priceChange>=priceChangeThreshold) {
			notifyObservers(stockSymbol, newPrice);
		}
	}
	
    

}
