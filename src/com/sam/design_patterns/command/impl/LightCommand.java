package com.sam.design_patterns.command.impl;

import com.sam.design_patterns.command.Command;
import com.sam.design_patterns.command.model.Light;

public class LightCommand implements Command{
	private Light light;
	
	public LightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
		System.out.println(light.getState());
	}
}
