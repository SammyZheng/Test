package com.sam.design_patterns.factory;

public class Pizza {
	
	protected String description;
	
	public void prepare() {
		System.out.println("Prepare!");
	}
	
	public void bake() {
		System.out.println("Bake");
	}
	
	public void cut() {
		System.out.println("Cut");
	}
	
	public void box() {
		System.out.println("Box");
	}
}
