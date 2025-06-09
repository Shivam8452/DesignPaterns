package com.designPatterns.structural.adaptorPatter.motifcationService;

public class SendgridAdapter implements NotificationService {
	
	private SendGridService sendGridService;
	
	public SendgridAdapter(SendGridService sendGridService) {
		this.sendGridService = sendGridService;
	}

	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		sendGridService.send(to, subject, body);
	}
	
	

}
