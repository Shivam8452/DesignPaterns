package com.designPatterns.behavioural.state.directionService;

public class DirectionService {
	
	private TransportMode transportMode;
	
	public DirectionService(TransportMode transportMode) {
		this.transportMode = transportMode;
	}
	
	public void setTransportMode(TransportMode transportMode) {
		this.transportMode=transportMode;
	}
	
	public int getETA() {
		return transportMode.calcETA();
	}
	
	public String getDirect() {
		return transportMode.CalDir();
	}

}
