package com.vendingMachine;

import java.util.List;

public interface State {
	
	public void pressCoinInsertButton(VendingMachine vendingMachine) throws Exception;
	public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception;
	public void InserCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception ;
	public int getChange(int returnChange) throws Exception ;
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
	public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception;
	public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception;
	
	

}
