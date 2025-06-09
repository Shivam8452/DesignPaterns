package com.designPatterns.behavioural.mediatorPattern.chatRoom;

public class User {
	
	private String name;
	private ChatMediator chatMediator;
	
	public User(String name, ChatMediator chatMediator) {
		this.name=name;
		this.chatMediator=chatMediator;
	}
	
	public void sendMessage(String message) {
		System.out.println(this.name+" Sending message "+message);
		chatMediator.sendMessage(message, this);
	}
	
	public void receiveeMessage(String msg, User sender) {
		System.out.println(this.name+" recieved message "+msg +" from "+sender .name);
	}

}
