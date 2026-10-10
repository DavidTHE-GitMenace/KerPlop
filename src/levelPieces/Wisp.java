package levelPieces;

import java.util.Random;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
 * A ghost that is pretty harmless that randomly attempts to drift left or right
 * 
 */
public class Wisp extends GamePiece implements Moveable {
    private final Random random = new Random();

    // constructor
    public Wisp(int location) {
        super('W', "Wisp", location);
    }

    // drawing it and moving it
    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int direction = random.nextBoolean() ? 1 : -1;
        int nextLocation = getLocation() + direction;

        // A failed random move simply leaves the wisp in place.
        if (nextLocation >= 0 && nextLocation < GameEngine.BOARD_SIZE
                && gameBoard[nextLocation] == null) {
            gameBoard[getLocation()] = null;
            gameBoard[nextLocation] = this;
            setLocation(nextLocation);
        }
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }
}
