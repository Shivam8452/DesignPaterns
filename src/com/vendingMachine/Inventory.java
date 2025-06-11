package com.vendingMachine;

public class Inventory {
	
	private ItemShelf[] inventory;
	
	public ItemShelf[] getInventory() {
		return inventory;
	}

	public void setInventory(ItemShelf[] inventory) {
		this.inventory = inventory;
	}

	public Inventory(int count) {
		inventory = new ItemShelf[count];
		initialiseEmptyInventory();
	}
	
	public void initialiseEmptyInventory() {
		int startCode = 101;
		for(int i=0;i<inventory.length;i++) {
			ItemShelf space = new ItemShelf(startCode);
			inventory[i] = space;
			space.setAvailabel(false);
			startCode++;
		}
	}
	
	public Item getItem(int code) {
		for(ItemShelf itemShelf: inventory) {
			if(itemShelf.getCode()==code) {
				return itemShelf.getItems().get(0);
			}
		}
		return null;
	}
	
	public void addItem(Item item,int codeNumber) {
		for(ItemShelf itemshelf:inventory) {
			if(itemshelf.getCode()==codeNumber) {
				itemshelf.addItem(item);
				itemshelf.setAvailabel(true);
			}
		}
	}
	
	public void updateInventory(int codeNumber) {
		for(ItemShelf itemshelf:inventory) {
			if(itemshelf.getCode()==codeNumber) {
				if(itemshelf.getItems().isEmpty()) {
					itemshelf.setAvailabel(false);
				}
			}
		}
	}
	
	public void removeItem(int codeNumber) {
		for(ItemShelf itemshelf:inventory) {
			if(itemshelf.getCode()==codeNumber) {
				itemshelf.removeItem(itemshelf.getItems().get(0));
				itemshelf.setAvailabel(false);
			}
		}
	}
	
	

}
