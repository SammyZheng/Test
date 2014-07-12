package com.sam.design_patterns.command.impl;

import com.sam.design_patterns.command.Command;

public class SimpleRemotCotrallor {
	public Command command;
	
	public SimpleRemotCotrallor() {};
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonPress() {
		command.execute();
	}
}
