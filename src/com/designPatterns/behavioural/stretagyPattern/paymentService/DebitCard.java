package com.designPatterns.behavioural.stretagyPattern.paymentService;

public class DebitCard extends Card {
     
	public DebitCard(String HolderName) {
		super(HolderName);
	}
	
	public void processPayment() {
		System.out.println("Making payment via Debit card");
	}
}
