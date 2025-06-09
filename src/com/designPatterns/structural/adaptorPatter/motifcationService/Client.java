package com.designPatterns.structural.adaptorPatter.motifcationService;

public class Client {
	
	public static void main(String[] args) {
		NotificationService emailService = new EmailNotification();
		
		emailService.send("shivam123@gmail.com", "Order confirmation", "Your order have been confirmed");
		
		NotificationService sendGridService = new SendgridAdapter(new SendGridService());
		sendGridService.send("shivam123@gmail.com", "Order confirmation", "Your order have been confirmed");

	}

}
