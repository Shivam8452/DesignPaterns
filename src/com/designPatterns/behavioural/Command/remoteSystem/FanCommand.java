package com.designPatterns.behavioural.Command.remoteSystem;

public class FanCommand {
	
	 public static class FanOnCommand implements Command {
	        
	        private Fan fan;

	        public FanOnCommand(Fan fan) {
	            this.fan = fan;
	        }

	        //TODO: Override the execute() method from the Command interface and Implement the logic to turn on the fan when this command is executed.
	        public void execute(){
	            fan.turnOn();
	        }
	        
	    }

	    public static class FanOffCommand implements Command {
	        
	        private Fan fan;

	        public FanOffCommand(Fan fan) {
	            this.fan = fan;
	        }

	        //TODO: Override the execute() method from the Command interface and Implement the logic to turn off the fan when this command is executed.
	        public void execute(){
	            fan.turnOff();
	        }
	        
	    }
	

	

}
