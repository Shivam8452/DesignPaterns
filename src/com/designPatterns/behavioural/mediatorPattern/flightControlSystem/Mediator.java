package com.designPatterns.behavioural.mediatorPattern.flightControlSystem;

public interface Mediator {
	public void registerAirplane(Airplane airplane);
	public void handleTakeoffRequest(Airplane airplane);
	public void handleLandingRequest(Airplane airplane);
}
