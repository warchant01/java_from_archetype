package com.techelevator.game;

public abstract class Game {
	
	private int numberOfPlayers;
	
	public Game(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	protected abstract void setup(int numberOfPlayers);  //Declared but not implemented here, implemented in Monopoly
	
	protected abstract void takeTurn(int player);
	
	protected abstract boolean isGameOver();
	
	protected abstract void finishGame();
	
	public final void playGame() {  //Note this is final, so subclasses cannot change this method
		setup(numberOfPlayers);
		for(int i = 0; !isGameOver(); i = (i+1) % numberOfPlayers) {
			takeTurn(i+1);
		}
		finishGame();
	}
}
