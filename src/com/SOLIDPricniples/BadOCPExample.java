package com.SOLIDPricniples;

public class BadOCPExample {
	
	private double amount;
	
	public BadOCPExample(double amount) {
		this.amount = amount;
	}
	
	public void processessPayment(String paymentMethod) {
		if(paymentMethod.equals("CreditCard")) {
			System.out.println("Making payment via Credit Card:"+amount);
		}else if(paymentMethod.equals("Debit Card")) {
			System.out.println("Making payment via Debit Card");
		}else if(paymentMethod.equals("paypal")) {
			System.out.println("Making payment via paypal");
		}else {
			throw new IllegalArgumentException("Invalid payment method"+paymentMethod);
		}
	}

}
