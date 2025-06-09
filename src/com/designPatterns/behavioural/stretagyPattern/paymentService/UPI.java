package com.designPatterns.behavioural.stretagyPattern.paymentService;

public class UPI implements PaymentStrategy{
	
	private String upiId;
	
	public UPI(String upiId) {
		this.upiId=upiId;
	}
	
	public void processPayment() {
		System.out.println("Making payment via UPI");
	}

}
