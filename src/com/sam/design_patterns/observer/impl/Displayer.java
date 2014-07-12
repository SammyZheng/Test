package com.sam.design_patterns.observer.impl;

import com.sam.design_patterns.observer.DisplayElement;
import com.sam.design_patterns.observer.Observer;
import com.sam.design_patterns.observer.Subject;

public class Displayer implements DisplayElement, Observer{
	private float temp;
	private float humidity;
	private Subject wheather;
	
	public Displayer(Subject wheather) {
		this.wheather = wheather;
		this.wheather.register(this);
	}
	
	@Override
	public void display() {
		System.out.println("temp: " + temp);
		System.out.println("humidity: " + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
