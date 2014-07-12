package com.sam.design_patterns.decorator;

public abstract class Beverage {
	protected String description = "unknow drink";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
