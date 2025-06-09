package com.designPatterns.creational.prototyprPattern.boardGame;

public class GamePiece implements Prototypr<GamePiece> {
	
	private String color;
	private int position;
	
	public GamePiece(String color, int position) {
		this.color=color;
		this.position=position;
		
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setPosition(int position) {
		this.position=position;
	}
	
	@Override
    public String toString() {
    	return "GamePiece{ color = " +color+" position="+position;
    }
	
	@Override
	public GamePiece Clone() {
		// TODO Auto-generated method stub
		return new GamePiece(this.color, this.position);
	}

}
