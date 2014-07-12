package com.sam.design_patterns.decorator.impl;

import com.sam.design_patterns.decorator.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
