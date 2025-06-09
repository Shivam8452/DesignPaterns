package com.SOLIDPricniples.DIP;

public class NotificationService {
	
	private NotificationChannel notific;
	
	public NotificationService(NotificationChannel notific) {
		this.notific=notific;
	}
	
	public void notify(String msg) {
		notific.send(msg);
	}

}
