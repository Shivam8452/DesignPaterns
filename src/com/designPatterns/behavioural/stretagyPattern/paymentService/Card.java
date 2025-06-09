package com.designPatterns.behavioural.stretagyPattern.paymentService;

abstract public class Card implements PaymentStrategy {
	private String Holdername;
	
	public Card(String Holdername) {
		this.Holdername=Holdername;
	}
	
	abstract public void processPayment();

}
