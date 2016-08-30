package com.mysoft.observerpattern;

public class ConCreteSubject extends Subject {

	public void change(String state){
		
		this.notifyObservers(state);
	}
}
