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
        
        // determines where the flag is depending on the level the player is on
        if (levelNum == 1) {
            board[2] = new Flag();
        } else if (levelNum == 2) {
            board[18] = new Flag();
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
