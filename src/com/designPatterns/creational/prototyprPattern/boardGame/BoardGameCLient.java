package com.designPatterns.creational.prototyprPattern.boardGame;

public class BoardGameCLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePiece piece = new GamePiece("Red", 1);
		
		GameBoard boar = new GameBoard();
		
		boar.addPiece(piece);
		boar.addPiece(new GamePiece("blue", 2));
		
		boar.showBoard();
		
        GameBoard newBoard = boar.Clone();		
		newBoard.showBoard();
	}

}
