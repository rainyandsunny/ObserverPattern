package com.mysoft.observerpattern;

public class ConcreteObserver implements Observer {

	@Override
	public void update(String state) {

		System.out.println("Subject changes: "+state);
	}

}
