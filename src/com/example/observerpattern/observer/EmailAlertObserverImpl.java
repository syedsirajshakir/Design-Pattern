package com.example.observerpattern.observer;

import com.example.observerpattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

	String emailAddress;
	
	StocksObservable observer;
	
	public EmailAlertObserverImpl(String emailAddress, StocksObservable observer) {
		super();
		this.emailAddress = emailAddress;
		this.observer = observer;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
       sendEmail(emailAddress,"Stock is availble ");
	}

	private void sendEmail(String emailAddress2, String string) {
		// TODO Auto-generated method stub
		System.out.println("Stock is available send notification "+emailAddress2);
	}

}
