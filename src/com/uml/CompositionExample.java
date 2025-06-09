package com.uml;

import java.util.ArrayList;
import java.util.List;

class Room{
	private String room;
	
	public Room(String name) {
		this.room=name;
	}
	
	public String getRoom() {
		return room;
	}
}

class House{
	private String HouseNo;
	
	private List<Room> rooms;
	
	public House(String HouseNo) {
		this.HouseNo=HouseNo;
		rooms = new ArrayList<>();
		rooms.add(new Room("Living Room"));
		rooms.add(new Room("BedRoom"));
	}
	
	public void showRoom() {
		for(Room r: rooms) {
			System.out.println("House"+HouseNo+"has Rooms"+r.getRoom());
		}
	}
	
}

public class CompositionExample {
	public static void main(String args[]) {
		House h = new House("Shivam's House");
		h.showRoom();
	}

}
