package com.designpattern.structural.observerpattern.observable;

import com.designpattern.structural.observerpattern.observer.NotificationAlertObserver;

public interface StocksObservable {
	
	public void add(NotificationAlertObserver observer);
	
	public void remove(NotificationAlertObserver observer);
	
	public void notifySubscribers();
	
	public void setStocksCount(int newStockAdded);
	
	public int getStockCount();

}
