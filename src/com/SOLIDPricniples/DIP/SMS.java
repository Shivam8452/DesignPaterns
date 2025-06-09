package com.SOLIDPricniples.DIP;

public class SMS implements NotificationChannel {
	
	public void send(String msg) {
		System.out.println(msg);
	}

}
