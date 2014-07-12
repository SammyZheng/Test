package com.sam.design_patterns.observer.test;

import com.sam.design_patterns.observer.impl.Displayer;
import com.sam.design_patterns.observer.impl.Displayer1;
import com.sam.design_patterns.observer.impl.WheatherData;
import com.sam.design_patterns.observer.impl.WheatherData1;

public class ObserverTest {
	public static void main(String[] args) {
		WheatherData wheatherData = new WheatherData();
		Displayer displayer = new Displayer(wheatherData);
		wheatherData.setWheatherData(1.0f, 2.0f, 3.0f);
		
		WheatherData1 wheatherData1 = new WheatherData1();
		Displayer1 displayer1 = new Displayer1(wheatherData1);
		
		wheatherData1.setWheatherData(4f, 5f, 6f);
	}
}
