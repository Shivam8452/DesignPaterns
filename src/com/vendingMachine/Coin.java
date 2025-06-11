package com.vendingMachine;

public enum Coin {
	ONERUPEE(1),
    TWORUPEE(2),
    FIVERUPEE(5),
	TENRUPEE(10);
	public int value;
	Coin(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}

}
