package com.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
	private State vendingMachineState;
	private List<Coin> coins;
	private Inventory inventory;
	
	public VendingMachine() {
		vendingMachineState = new IdleState();
		coins = new ArrayList<>();
		inventory = new Inventory(10);
	}
	
	public State getVendingMachineState() {
		return vendingMachineState;
	}
	public void setVendingMachineState(State vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}
	public List<Coin> getCoins() {
		return coins;
	}
	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}
