package com.designPatterns.behavioural.state.mediaPlayer;

public class MediaPlayer {
	private State state;
	
	public MediaPlayer(State state) {
		this.state=state;
	}
	
	public void setState(State state) {
		this.state=state;
	}
	
	public void getState() {
		state.state();
	}

}
