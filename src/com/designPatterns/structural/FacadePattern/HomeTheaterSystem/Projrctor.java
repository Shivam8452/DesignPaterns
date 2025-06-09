package com.designPatterns.structural.FacadePattern.HomeTheaterSystem;

public class Projrctor {
	public void on() {
        System.out.println("Projector: Turned on");
    }

    public void off() {
        System.out.println("Projector: Turned off");
    }

    public void setInput() {
        System.out.println("Projector: Input set to DVD");
    }

}
