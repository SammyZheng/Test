package com.sam.design_patterns.factory;

import com.sam.design_patterns.factory.impl.CheesePizza;
import com.sam.design_patterns.factory.impl.ClamPizza;
import com.sam.design_patterns.factory.impl.VeggiePizza;

public class SimplePizzaFactory {
	
	private Pizza pizza;
	
	public Pizza createPizza(String type) {
		if("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if("clam".equals(type)) {
			pizza = new ClamPizza();
		} else if("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
