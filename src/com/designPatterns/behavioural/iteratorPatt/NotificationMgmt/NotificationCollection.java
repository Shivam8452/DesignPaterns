package com.designPatterns.behavioural.iteratorPatt.NotificationMgmt;

import java.util.Iterator;

public interface NotificationCollection {
	
	public Iterator<Notification> createIterator();

}
