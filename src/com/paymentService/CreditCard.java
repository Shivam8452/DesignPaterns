package com.paymentService;

public class CreditCard extends Card {

	public CreditCard(String HolderName, int cardNo) {
		super(HolderName, cardNo);
		// TODO Auto-generated constructor stub
	}
	
	public void pay() {
		System.out.println("Making payment through credit card");
	}

}
