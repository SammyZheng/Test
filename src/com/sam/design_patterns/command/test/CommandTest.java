package com.sam.design_patterns.command.test;

import com.sam.design_patterns.command.impl.LightCommand;
import com.sam.design_patterns.command.impl.SimpleRemotCotrallor;
import com.sam.design_patterns.command.model.Light;

public class CommandTest {

	public static void main(String[] args) {
		SimpleRemotCotrallor cotrallor = new SimpleRemotCotrallor();
		Light light = new Light();
		LightCommand command = new LightCommand(light);
		cotrallor.setCommand(command);
		cotrallor.buttonPress();
	}
}
