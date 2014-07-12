package com.sam.design_patterns.decorator.impl;

import com.sam.design_patterns.decorator.Beverage;
import com.sam.design_patterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
