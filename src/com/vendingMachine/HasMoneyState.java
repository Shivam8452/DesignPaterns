package com.vendingMachine;

import java.util.List;

public class HasMoneyState implements State {

	@Override
	public void pressCoinInsertButton(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");
	}

	@Override
	public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		vendingMachine.setVendingMachineState(new SelectionState());
	}

	@Override
	public void InserCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		vendingMachine.getCoins().add(coin);
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
		machine.setVendingMachineState(new IdleState());
		return machine.getCoins();
	}

	@Override
	public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");

	}

	@Override
	public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Illegal Action");

	}

}
