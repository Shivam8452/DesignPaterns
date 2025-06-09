package com.designPatterns.behavioural.mediatorPattern.flightControlSystem;

public class Airplane {
	private String id;
	private Mediator mediator;
	
	public Airplane(String id,Mediator mediator) {
		this.id=id;
		this.mediator=mediator;
	}
	
	 public void setMediator(Mediator mediator) {
	        this.mediator = mediator;
	    }
	
	public void requestTakeoff(){
        System.out.println("Airplane " + id + " requesting takeoff");
        mediator.handleTakeoffRequest(this);
	}
	
	public void sendLandingRequest() {
        System.out.println("Airplane " + id + " requesting takeoff");
        mediator.handleLandingRequest(this);
	}
	
	public void receiveNotification(String message) {
        System.out.println("Airplane " + id + ": " + message);
    }

    public String getId() {
        return id;
    }

}
