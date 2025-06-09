package com.SOLIDPricniples.SRP;

public class Inovice {
	
	private double amount;
	
	public Inovice(double amount) {
		this.amount=amount;
	}
	
	public void generateInovice() {
		System.out.println("Generating Inovice for amount: "+amount);
	}

}
