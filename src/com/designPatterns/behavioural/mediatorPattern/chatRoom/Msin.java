package com.designPatterns.behavioural.mediatorPattern.chatRoom;

public class Msin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom chatRoom = new ChatRoom();
		
		User rahul = new User("Rahul", chatRoom);
		User shivam = new User("shivam", chatRoom);
		User neha = new User("neha", chatRoom);
		
		chatRoom.addUser(neha);
		chatRoom.addUser(shivam);
		chatRoom.addUser(rahul);
		shivam.sendMessage("Hi everyone");
		

	}

}
