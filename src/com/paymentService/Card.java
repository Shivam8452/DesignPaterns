package com.paymentService;

abstract public class Card implements PaymentMethod{
	private String HolderName;
	
	private int cardNo;
	
	public Card(String HolderName, int cardNo) {
		this.cardNo = cardNo;
		this.HolderName = HolderName;
	}
	
	public String getHolderName() {
		return HolderName;
	}
	
	public int getCardNo() {
		return cardNo;
	}
	
	public abstract void pay();
	
}
