package com.designPatterns.behavioural.Command.remoteSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Light light = new Light();
	        Fan fan = new Fan();

	        // Create commands
	        Command lightOn = new LightCommand.LightOnCommand(light);
	        Command lightOff = new LightCommand.LightOffCommand(light);
	        Command fanOn = new FanCommand.FanOnCommand(fan);
	        Command fanOff = new FanCommand.FanOffCommand(fan);
		RemoteControl remoteControl = new RemoteControl();
		
	}

}
