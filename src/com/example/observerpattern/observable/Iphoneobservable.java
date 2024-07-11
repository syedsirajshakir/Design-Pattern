package com.example.observerpattern.observable;

import java.util.ArrayList;
import java.util.List;

import com.example.observerpattern.observer.NotificationAlertObserver;

public class Iphoneobservable implements StocksObservable{

	List<NotificationAlertObserver> listObserver=new ArrayList<>();
	
	int stockCount=0;
	@Override
	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		listObserver.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		listObserver.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver obsever:listObserver) {
			obsever.update();
		}
	}

	@Override
	public void setStocksCount(int newStockAdded) {
		// TODO Auto-generated method stub
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount=stockCount+newStockAdded;
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
