package com.sam.design_patterns.decorator.test;

import com.sam.design_patterns.decorator.Beverage;
import com.sam.design_patterns.decorator.impl.DarkRoast;
import com.sam.design_patterns.decorator.impl.Espresso;
import com.sam.design_patterns.decorator.impl.HouseBlend;
import com.sam.design_patterns.decorator.impl.Mocha;
import com.sam.design_patterns.decorator.impl.Soy;
import com.sam.design_patterns.decorator.impl.Whip;

public class BeverageTest {
	
	public static void main(String[] args) {
		BeverageTest test = new BeverageTest();
		
		Beverage espresso = new Espresso();
		test.print(espresso);
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		test.print(houseBlend);
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Soy(darkRoast);
		darkRoast = new Whip(darkRoast);
		test.print(darkRoast);
	}
	
	public void print(Beverage beverage) {
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
