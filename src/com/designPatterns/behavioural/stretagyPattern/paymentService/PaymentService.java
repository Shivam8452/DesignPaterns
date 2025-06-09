package com.designPatterns.behavioural.stretagyPattern.paymentService;

public class PaymentService {
	private PaymentStrategy strategy;
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy=strategy;
	}
	
	public void pay() {
		strategy.processPayment();
	}
	

}
