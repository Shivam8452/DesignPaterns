package com.designPatterns.behavioural.observerPattern.stockMonitoring;

import java.util.Scanner;

public class Exercise {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double priceChangeThreshold = sc.nextDouble();
        StockMarket stockMarket = new StockMarket(priceChangeThreshold);

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();
        
        stockMarket.registerObserver(investorA);
        stockMarket.registerObserver(investorB);
        
        int updates = sc.nextInt();
        
        for (int i = 1; i <= updates; i++) {
            
            if(i == 5) { 
            stockMarket.registerObserver(investorB);
            }
            
            String stockSymbol = sc.next();
            double newPrice = sc.nextDouble();
            double oldPrice = sc.nextDouble();
            
            stockMarket.setStockPrice(stockSymbol, newPrice, oldPrice);
        }
        sc.close();
	}
}
