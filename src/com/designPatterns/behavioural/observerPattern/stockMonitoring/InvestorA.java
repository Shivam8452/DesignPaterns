package com.designPatterns.behavioural.observerPattern.stockMonitoring;

public class InvestorA implements Observer {

	@Override
	public void update(String stockSymbol, double newPrice) {
		// TODO Auto-generated method stub
		System.out.println("Investor A notified: Stock " + stockSymbol + " has a new price: $" + newPrice);
	}

}
