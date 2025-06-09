package com.SOLIDPricniples.DIP;

public class Email implements NotificationChannel {
	
	public void send(String msg) {
		System.out.println(msg);
	}

}
