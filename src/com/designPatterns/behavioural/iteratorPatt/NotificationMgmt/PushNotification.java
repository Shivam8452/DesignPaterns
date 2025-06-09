package com.designPatterns.behavioural.iteratorPatt.NotificationMgmt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PushNotification implements NotificationCollection {
	private Set<Notification> pushNotifications;
	
	public PushNotification() {
		pushNotifications = new HashSet();
	}
	
	public void addPushNotification(Notification push) {
		pushNotifications.add(push);
	}
	@Override
	public Iterator<Notification> createIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class PushNotificationIterator implements Iterator<Notification>{
        private Iterator<Notification> iter;
        
        public PushNotificationIterator(Set<Notification> iter) {
        	this.iter=iter.iterator();
        }
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return iter.hasNext();
		}

		@Override
		public Notification next() {
			// TODO Auto-generated method stub
			return iter.next();
		}
		
	}

}
