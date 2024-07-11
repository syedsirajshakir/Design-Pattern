package com.example.observerpattern.observable;

import com.example.observerpattern.observer.NotificationAlertObserver;

public interface StocksObservable {
	
	public void add(NotificationAlertObserver observer);
	
	public void remove(NotificationAlertObserver observer);
	
	public void notifySubscribers();
	
	public void setStocksCount(int newStockAdded);
	
	public int getStockCount();

}
