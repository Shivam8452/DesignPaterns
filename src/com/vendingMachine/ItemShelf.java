package com.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {
	
	private List<Item> items;
	private boolean isAvailabel;
	private int codeNumber;
	
	public ItemShelf(int codeNumber) {
		items = new ArrayList<>();
		isAvailabel =true;
		this.codeNumber=codeNumber;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
		isAvailabel=true;
	}

	public void setAvailabel(boolean isAvailabel) {
		this.isAvailabel = isAvailabel;
	}

	public void setCodeNumber(int codeNumber) {
		this.codeNumber = codeNumber;
	}

	public int getCode() {
		return codeNumber;
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public boolean checkIsAvailable() {
		return isAvailabel;
	}
	
	public void addItem(Item item) {
		items.add(item);
		isAvailabel=true;
	}
	
	public void removeItem(Item item) {
		items.remove(item);
		isAvailabel=false;
	}
	

}
