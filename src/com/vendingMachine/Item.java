package com.vendingMachine;

public class Item {
	private ItemType itemType;
	private int price;
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setItemType(ItemType itemType) {
		this.itemType=itemType;
	}
	
	public int getPrice() {
		return price;
	}
	
	public ItemType getItemType() {
		return itemType;
	}
	
	
	
	
	

}
