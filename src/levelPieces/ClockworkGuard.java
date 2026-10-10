package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
 * Moves one square per turn in a straight line, reversing at an edge or another piece
 * Hits the player when within one square
 */
public class ClockworkGuard extends GamePiece implements Moveable {
    private int direction;
    
    // constructor
    public ClockworkGuard(int location, int initialDirection) {
        super('G', "Clockwork guard", location);
        if (initialDirection < 0) {
        	direction = -1;
        }
        else {
        	direction = 1;
        }
    }

    // 
    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int nextLocation = getLocation() + direction;

        // Turn around instead of walking off the board or overwriting a piece
        if (!isFree(gameBoard, nextLocation)) {
            direction = -direction;
            nextLocation = getLocation() + direction;
        }

        if (isFree(gameBoard, nextLocation)) {
            gameBoard[getLocation()] = null;
            gameBoard[nextLocation] = this;
            setLocation(nextLocation);
        }
    }

    // isFree function
    private boolean isFree(Drawable[] gameBoard, int location) {
        return location >= 0 && location < GameEngine.BOARD_SIZE
                && gameBoard[location] == null;
    }

    // interaction function
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (Math.abs(playerLocation - getLocation()) <= 1) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
