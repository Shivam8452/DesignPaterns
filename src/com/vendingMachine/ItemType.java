package com.vendingMachine;

public enum ItemType {
	
	COKE(5),
	CHIPS(3),
	BISCUITS(10),
	CHOCOLATES(12);
	
	
	public int value;

	ItemType(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	

}
