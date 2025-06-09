package com.designPatterns.behavioural.state.directionService;

public class Car implements TransportMode{

	@Override
	public int calcETA() {
		// TODO Auto-generated method stub
		System.out.println("ETA for car");
		return 5;
	}

	@Override
	public String CalDir() {
		// TODO Auto-generated method stub
		return "Direction for car";
	}

}
