package com.designPatterns.structural.FacadePattern.HomeTheaterSystem;

public class LightControl {
	public void dim(int level) {
        System.out.println("Lighting Control: Dimming lights to " + level + "%");
    }

    public void on() {
        System.out.println("Lighting Control: Lights are on");
    }

    public void off() {
        System.out.println("Lighting Control: Lights are off");
    }

}
