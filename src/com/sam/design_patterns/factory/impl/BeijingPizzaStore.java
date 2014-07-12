package com.sam.design_patterns.factory.impl;

import com.sam.design_patterns.factory.Pizza;
import com.sam.design_patterns.factory.PizzaStore;
import com.sam.design_patterns.factory.SimplePizzaFactory;

public class BeijingPizzaStore extends PizzaStore{

	public BeijingPizzaStore(SimplePizzaFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizza(String type) {
		return new Pizza();
	}

}
