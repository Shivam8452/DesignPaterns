package com.designPatterns.structural.FacadePattern.APIGateway;

public class PaymentService {
	
	private String paymentId;
	
	public String processPayemnt(String payment) {
		return "Process payment: "+payment;
	}
}
