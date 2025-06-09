package com.designPatterns.behavioural.state.mediaPlayer;

public class Main {
	
	public static void main(String[] args) {
		MediaPlayer mediaPlay = new MediaPlayer(new PlayingState());
		mediaPlay.setState(new StoppedState());
		mediaPlay.getState();
	}
}
