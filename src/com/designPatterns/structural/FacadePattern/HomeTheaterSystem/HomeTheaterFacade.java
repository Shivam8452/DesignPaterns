package com.designPatterns.structural.FacadePattern.HomeTheaterSystem;

public class HomeTheaterFacade {
	private DVDPlayer dvdPlayer;
    private Projrctor projector;
    private SoundSystem soundSystem;
    private LightControl lightingControl;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projrctor();
        this.soundSystem = new SoundSystem();
        this.lightingControl = new LightControl();
    }

    public void watchMovie(int dimmingPercentage, int volumeLevel) {
    	lightingControl.dim(dimmingPercentage);
    	projector.on();
    	projector.setInput();
    	soundSystem.on();
    	soundSystem.setVolume(volumeLevel);
    	dvdPlayer.play();
    }

}
