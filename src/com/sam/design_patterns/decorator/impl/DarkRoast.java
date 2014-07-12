package com.sam.design_patterns.decorator.impl;

import com.sam.design_patterns.decorator.Beverage;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
