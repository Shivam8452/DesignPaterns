package com.designPatterns.behavioural.state.directionService;

public class Walking implements TransportMode {

	@Override
	public int calcETA() {
		// TODO Auto-generated method stub
		System.out.println("ETA for Walking");
		return 10;
	}

	@Override
	public String CalDir() {
		// TODO Auto-generated method stub
		return "Direction for walking";
	}

}
