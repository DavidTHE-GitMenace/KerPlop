package levelPieces;

import java.util.ArrayList;
import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.GameEngine;

public class LevelSetup {

	// variables that we gotta make
	private Drawable[] board;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	private int playerStartLoc;

	// createLevel function

	public void createLevel(int levelNum) {
		board = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<>();
		interactingPieces = new ArrayList<>();

		playerStartLoc = 10;

		if (levelNum == 1) {
			// Decorative piece
			board[2] = new Flag();

			// Moving pieces
			ClockworkGuard guard = new ClockworkGuard(4, 1);
			Wisp wisp = new Wisp(7);

			board[4] = guard;
			board[7] = wisp;

			movingPieces.add(guard);
			movingPieces.add(wisp);

			interactingPieces.add(guard);
			interactingPieces.add(wisp);

			// Stationary interactive pieces
			Coin coin = new Coin(11);
			Portal portal = new Portal(13);
			SpikeTrap trap = new SpikeTrap(16);
			LaserTurret laser = new LaserTurret(20);

			board[11] = coin;
			board[13] = portal;
			board[16] = trap;
			board[20] = laser;

			interactingPieces.add(coin);
			interactingPieces.add(portal);
			interactingPieces.add(trap);
			interactingPieces.add(laser);

		} else if (levelNum == 2) {
			board[18] = new Flag();

			// Moving pieces
			ClockworkGuard guard = new ClockworkGuard(3, 1);
			Wisp wisp = new Wisp(7);

			board[3] = guard;
			board[7] = wisp;

			movingPieces.add(guard);
			movingPieces.add(wisp);

			interactingPieces.add(guard);
			interactingPieces.add(wisp);

			// Stationary interactive pieces
			Coin coin = new Coin(11);
			Portal portal = new Portal(14);
			SpikeTrap trap = new SpikeTrap(16);
			LaserTurret laser = new LaserTurret(20);

			board[11] = coin;
			board[14] = portal;
			board[16] = trap;
			board[20] = laser;

			interactingPieces.add(coin);
			interactingPieces.add(portal);
			interactingPieces.add(trap);
			interactingPieces.add(laser);
		}
	}


	// returns the borad array in the LevelSetup object
	public Drawable[] getBoard() {
		return board;
	}

	// get the moving pieces
	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}

	// return the interacting pieces
	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	// where the player should start on the board
	public int getPlayerStartLoc() {
		return playerStartLoc;
	}
}
