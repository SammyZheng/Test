package com.sam.design_patterns.command.model;

public class Light {
	
	private String state;
	
	public Light() {
		off();
	}
	
	public void on() {
		state = "ON";
	}
	
	public void off() {
		state = "OFF";
	}

	public String getState() {
		return state;
	}
}
