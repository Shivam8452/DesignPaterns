package com.designPatterns.structural.adaptorPatter.motifcationService;

public class SendGridService {
	
	public void send(String to, String title, String body) {
		System.out.println("---------Sending email from in-house SendGridService----- ");
		// TODO Auto-generated method stub
		System.out.println("Sending email to: "+ to);
		System.out.println("Subject: "+ title);
		System.out.println("Body "+ body);
	}
	
}
