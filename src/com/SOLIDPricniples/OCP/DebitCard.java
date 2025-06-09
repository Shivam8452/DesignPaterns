package com.SOLIDPricniples.OCP;

public class DebitCard extends Card{
	
	public DebitCard(String cardNo, String Holdername) {
		super(cardNo,Holdername);
	}
	
	public void pay() {
		System.out.println("Payment made through Debit Card");
	}

}
