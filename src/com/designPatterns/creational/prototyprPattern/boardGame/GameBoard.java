package com.designPatterns.creational.prototyprPattern.boardGame;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototypr<GameBoard> {
	
	private List<GamePiece> pieces= new ArrayList();
	
	public void addPiece(GamePiece piece) {
		pieces.add(piece);
	}
	
	public List<GamePiece> getPieces(){
		return pieces;
	}
	
	public void showBoard() {
		for(GamePiece piece: pieces) {
			System.out.println(piece);
		}
	}

	@Override
	public GameBoard Clone() {
		// TODO Auto-generated method stub
		
		GameBoard newBoard = new GameBoard();
		for(GamePiece piece: pieces) {
			newBoard.addPiece(piece.Clone());
		}
		
		return newBoard;
	}

}
