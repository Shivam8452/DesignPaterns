package com.SOLIDPricniples.DIP;

public class Main {
	
	public static void main(String args[]) {
		NotificationService ser = new NotificationService(new Email());
		ser.notify("The package has been shipped");
		
		NotificationService ser1 = new NotificationService(new SMS());
		ser1.notify("Otp is 1234");
	}

}
