package com.sam.design_patterns.singleton.impl;

public class ChocolateBoiler {
	
	private boolean isEmpty;
	private boolean isBoiled;
	
	private static ChocolateBoiler chocolateBoiler;
	
	private ChocolateBoiler() {
		isEmpty = true;
		isBoiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(null == chocolateBoiler) {
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}
	
	public void fill() {
		if(isEmpty()) {
			isEmpty = false;
			isBoiled = false;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			isEmpty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			isBoiled = true;
		}
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public boolean isBoiled() {
		return isBoiled;
	}

}
