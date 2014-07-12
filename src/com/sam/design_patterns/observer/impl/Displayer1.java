package com.sam.design_patterns.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.sam.design_patterns.observer.DisplayElement;

public class Displayer1 implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Observable observable;
	
	public Displayer1(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("temp: " + temp);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WheatherData1) {
			WheatherData1 wheatherData = (WheatherData1)o;
			this.temp = wheatherData.getTemp();
			display();
		}
	}

}
