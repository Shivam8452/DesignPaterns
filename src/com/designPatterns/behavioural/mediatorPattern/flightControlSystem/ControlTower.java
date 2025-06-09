package com.designPatterns.behavioural.mediatorPattern.flightControlSystem;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements Mediator {
	
	private List<Airplane> airplanes;
	private int takeoffRunways;
    private int landingRunways;
		
	public void ControllTower() {
		airplanes = new ArrayList();

        this.takeoffRunways = 2;
        this.landingRunways = 2;
	}
	

	@Override
	public void registerAirplane(Airplane airplane) {
		// TODO Auto-generated method stub
		airplanes.add(airplane);
        airplane.setMediator(this);

		
	}

	@Override
	public void handleTakeoffRequest(Airplane airplane) {
		// TODO Auto-generated method stub
		 if (takeoffRunways > 0) {
	            takeoffRunways--; 
	            notifyAirplane(airplane, "Takeoff approved. Runways available: " + takeoffRunways);
	        } else {
	            notifyAirplane(airplane, "Takeoff denied. No runways available. Please wait");
	        }
	}

	@Override
	public void handleLandingRequest(Airplane airplane) {
		// TODO Auto-generated method stub
		 if (landingRunways > 0) {
	            landingRunways--;
	            notifyAirplane(airplane, "Landing approved. Runways available: " + landingRunways);
	        } else {
	            notifyAirplane(airplane, "Landing denied. No runways available. Please wait");
	        }
	}
	
	 public void completeTakeoff(Airplane airplane) {
	        System.out.println("Airplane " + airplane.getId() + " has taken off");
	        takeoffRunways++;
	        System.out.println("Runway freed. Available takeoff runways: " + takeoffRunways);
	    }
	 
	 public void completeLanding(Airplane airplane) {
	        System.out.println("Airplane " + airplane.getId() + " has landed");
	        landingRunways++;
	        System.out.println("Runway freed. Available landing runways: " + landingRunways);
	    }
	 
	 private void notifyAirplane(Airplane airplane, String message) {
	        // TODO: Notify the airplane of the status message from the control tower
	        
		 airplane.receiveNotification(message);
	        	
	    }

}
