package com.mysoft.observerpattern;

public class Client {

	public static void main(String[] args) {

		ConCreteSubject subject = new ConCreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("1");
	}

}
