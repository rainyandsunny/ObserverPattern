package com.mysoft.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> list = new ArrayList<>();
	
	
	public void attach(Observer observer){
		list.add(observer);
	}
	
	public void detach(Observer observer){
		list.remove(observer);
	}
	
	public void notifyObservers(String newState){
		
		for(int i=0;i<list.size();i++){
			
			Observer ob = list.get(i);
			ob.update(newState);
		}
	}
	
}
