package com.SOLIDPricniples.OCP;

public class CreditCard extends Card{
	
	public CreditCard(String cardNo, String HolderName) {
		super(cardNo,HolderName);
	}
	
	public void pay() {
		System.out.println("Payment made through Credit card");
	}

}
