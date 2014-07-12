package com.sam.design_patterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.sam.design_patterns.observer.Observer;
import com.sam.design_patterns.observer.Subject;

public class WheatherData implements Subject{
	private ArrayList observerList;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WheatherData(){
		observerList = new ArrayList();
	}
	
	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void remove(Observer o) {
		int index = observerList.indexOf(o);
		if(index >= 0) {
			observerList.remove(index);
		}
	}

	@Override
	public void nodifyAll() {
		for(int i = 0; i < observerList.size(); i++) {
			Observer observer = (Observer) observerList.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	/**
	 * 天气改变
	 */
	public void wheatherChanged() {
		nodifyAll();
	}
	
	public void setWheatherData(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		wheatherChanged();
	}
}
