package com.designPatterns.behavioural.iteratorPatt.NotificationMgmt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class SMSNotification implements NotificationCollection {
	private Queue<Notification> smsNotifications;
	
	public SMSNotification() {
		smsNotifications = new ArrayDeque<>();
	}
	
	public void addSMSNotification(Notification smsNotification) {
		this.smsNotifications.add(smsNotification);
	}

	@Override
	public Iterator<Notification> createIterator() {
		// TODO Auto-generated method stub
		return new SMSNotificationIterator(smsNotifications);
	}
	
	public class SMSNotificationIterator implements Iterator<Notification>{
		
		private Queue<Notification> sms;
		
		public SMSNotificationIterator(Queue<Notification> sms) {
			this.sms=sms;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !sms.isEmpty();
		}

		@Override
		public Notification next() {
			// TODO Auto-generated method stub
			Notification noti = sms.peek();
			sms.poll();
			return noti;
		}
		
	}

}
