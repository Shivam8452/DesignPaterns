package com.designPatterns.behavioural.mediatorPattern.chatRoom;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
	
	private List<User> users;
	
	public ChatRoom() {
		users = new ArrayList();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		
	}

	@Override
	public void sendMessage(String msg, User sender) {
		// TODO Auto-generated method stub
		for(User user:users) {
			if(user!=sender) {
				user.receiveeMessage(msg, sender);
			}
		}
		
	}

}
