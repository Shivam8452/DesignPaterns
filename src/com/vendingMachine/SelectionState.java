package com.vendingMachine;

import java.util.List;

public class SelectionState implements State {

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
		Item item = vendingMachine.getInventory().getItem(code);
		int paidbyuser = 0;
		for(Coin coin: vendingMachine.getCoins()) {
			paidbyuser = paidbyuser+coin.value;
		}
		
		if(item==null) {
			vendingMachine.setVendingMachineState(new IdleState());
			refundFullMoney(vendingMachine);
		}
		
		if(paidbyuser<item.getPrice()) {
			refundFullMoney(vendingMachine);
			throw new Exception("Illegal Action");
		}else {
			if(paidbyuser>item.getPrice()) {
				getChange(paidbyuser-item.getPrice());
			}
			vendingMachine.setVendingMachineState(new DespenseProductState(vendingMachine, code));
		}
	}

	@Override
	public int getChange(int returnChange) throws Exception {
		// TODO Auto-generated method stub
		return returnChange;
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return machine.getCoins();
	}

	@Override
	public Item despenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
