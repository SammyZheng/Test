package com.sam.design_patterns.factory;

public abstract class PizzaStore {
	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	
	public void orderPizaa2() {
		
	}
	
	public abstract Pizza createPizza(String type);
}
