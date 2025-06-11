package com.vendingMachine;

import java.util.List;

public class DespenseProductState implements State {
	
	public DespenseProductState(VendingMachine vendingMachine, int code) throws Exception {
		despenseProduct(vendingMachine,code);
	}

	@Override
	public void pressCoinInsertButton(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
		
	}

	@Override
	public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
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
		Item item = vendingMachine.getInventory().getItem(code);
		vendingMachine.getInventory().updateInventory(code);
		vendingMachine.setVendingMachineState(new IdleState());
		return item;
	}

	@Override
	public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
	}

}
