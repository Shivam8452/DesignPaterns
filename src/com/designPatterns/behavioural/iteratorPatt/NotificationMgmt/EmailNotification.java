package com.designPatterns.behavioural.iteratorPatt.NotificationMgmt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmailNotification implements NotificationCollection{
	private List<Notification> email;
	
	public EmailNotification() {
		email=new ArrayList();
	}
	
	public void addEmailNotifications(Notification emailNotifi) {
		email.add(emailNotifi);
	}
	
	public Iterator<Notification> createIterator(){
		return new EmailNotificationIterator(email);
	}
	
	public class EmailNotificationIterator implements Iterator<Notification>{
		
		private int position = 0;
		public List<Notification> notification;
		
		public EmailNotificationIterator(List<Notification> notification) {
            this.notification = notification;
        }

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return position<notification.size();
		}

		@Override
		public Notification next() {
			// TODO Auto-generated method stub
			return notification.get(position++);
		}
		
	}

}
