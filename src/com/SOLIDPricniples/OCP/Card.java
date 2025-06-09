package com.SOLIDPricniples.OCP;

abstract public class Card implements PaymentMethod{
	
	private String cardNo;
	
	private String HolderName;
	
	public Card(String cardNo, String HolderName) {
		this.cardNo=cardNo;
		this.HolderName=HolderName;
	}
	
	abstract public void pay();

}
