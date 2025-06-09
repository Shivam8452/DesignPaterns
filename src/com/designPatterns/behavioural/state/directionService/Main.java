package com.designPatterns.behavioural.state.directionService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectionService directionService = new DirectionService(new Car());
//		directionService.setTransportMode(new Walking());
		
		System.out.println(directionService.getDirect());
		System.out.println(directionService.getETA());

	}

}
