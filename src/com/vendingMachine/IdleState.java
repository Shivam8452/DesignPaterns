package com.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

	@Override
	public void pressCoinInsertButton(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub
		System.out.println("Press Insert coin button");
		vendingMachine.setCoins(new ArrayList<>());
	}

	@Override
	public void clickOnChooseProductButton(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub
		vendingMachine.setVendingMachineState(new HasMoneyState());
		}

	@Override
	public void InserCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
	}

	@Override
	public int getChange(int returnChange) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
		}

	@Override
	public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		 throw new Exception("Illegal Action");
	}
	

	@Override
	public void updateInventory(VendingMachine vendingMachine, Item item, int code) {
		// TODO Auto-generated method stub
		vendingMachine.getInventory().addItem(item, code);
	}

}
