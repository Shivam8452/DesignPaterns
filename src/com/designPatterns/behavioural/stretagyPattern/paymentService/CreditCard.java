package com.designPatterns.behavioural.stretagyPattern.paymentService;

public class CreditCard extends Card {
	
	public CreditCard(String Holdername) {
		super(Holdername);
	}
	
	public void processPayment() {
		System.out.println("Making payment via CreditCard");
	}

}
