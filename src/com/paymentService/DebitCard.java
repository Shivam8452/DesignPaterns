package com.paymentService;

public class DebitCard extends Card{

	public DebitCard(String HolderName, int cardNo) {
		super(HolderName, cardNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
		System.out.println("Making Payment throught Debit card");
		
	}

}
