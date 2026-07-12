package com.designpattern.structural.observerpattern;

import com.designpattern.structural.observerpattern.observable.Iphoneobservable;
import com.designpattern.structural.observerpattern.observable.StocksObservable;
import com.designpattern.structural.observerpattern.observer.EmailAlertObserverImpl;
import com.designpattern.structural.observerpattern.observer.MobileAlertObserverImpl;
import com.designpattern.structural.observerpattern.observer.NotificationAlertObserver;

public class Store {
	
	public static void main(String args[]) {
		StocksObservable stock=new Iphoneobservable();
		
		NotificationAlertObserver user1=new EmailAlertObserverImpl("abc@gamil.com",stock);
		NotificationAlertObserver user2=new MobileAlertObserverImpl(1234,stock);
		NotificationAlertObserver user3=new EmailAlertObserverImpl("abc@gamil.com",stock);
		NotificationAlertObserver user4=new MobileAlertObserverImpl(5678,stock);
		NotificationAlertObserver user5=new EmailAlertObserverImpl("xyz@gamil.com",stock);
		NotificationAlertObserver user6=new MobileAlertObserverImpl(9999,stock);
		
		stock.add(user1);
		stock.add(user2);
		stock.add(user3);
		stock.add(user4);
		stock.add(user5);
		stock.add(user6);
		System.out.println("...."); 
		stock.setStocksCount(10);
		
		
	
	}

}
