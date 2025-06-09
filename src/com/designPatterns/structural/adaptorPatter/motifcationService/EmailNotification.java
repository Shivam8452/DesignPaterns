package com.designPatterns.structural.adaptorPatter.motifcationService;

public class EmailNotification implements NotificationService {

	@Override
	public void send(String to, String subject, String body) {
		System.out.println("---------Sending email from in-house emailService----- ");
		// TODO Auto-generated method stub
		System.out.println("Sending email to: "+ to);
		System.out.println("Subject: "+ subject);
		System.out.println("Body "+ body);

	}

}
