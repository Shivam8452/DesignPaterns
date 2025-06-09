package com.designPatterns.behavioural.Command.textEditorII;

public class Buttons {
	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void onCLick() {
		command.execute();
	}

}
