package com.sam.design_patterns.decorator.impl;

import com.sam.design_patterns.decorator.Beverage;
import com.sam.design_patterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

}
