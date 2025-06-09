package com.designPatterns.behavioural.stretagyPattern.paymentService;

public class Main {
	
	public static void main(String args[]) {
		PaymentService service = new PaymentService();
		service.setPaymentStrategy(new DebitCard("Shivam"));
		
		service.pay();
	}

}
