package com.SOLIDPricniples.OCP;

public class Wallet implements PaymentMethod {
	private String wallet;
	
	public Wallet(String wallet) {
		this.wallet=wallet;
	}
	
	public void pay() {
		System.out.println("Paying through wallet");
	}
	

}
