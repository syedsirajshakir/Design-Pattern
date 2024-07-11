package com.example.observerpattern.observer;

import com.example.observerpattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	int mobileNumber;
	
	StocksObservable observer;
	
	
	public MobileAlertObserverImpl(int mobileNumber, StocksObservable observer) {
		this.mobileNumber = mobileNumber;
		this.observer = observer;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
       sendSMS(mobileNumber);
	}


	private void sendSMS(int mobileNumber2) {
		// TODO Auto-generated method stub
		System.out.println("Notification message stock is available "+mobileNumber2);
	}

}
