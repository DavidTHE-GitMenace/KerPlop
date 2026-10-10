package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Coin extends GamePiece {

	// the player hasn't collected anything
    private boolean collected = false;

    // constructor for coin
    public Coin(int location) {
    	// calls the parent constructor
        super('C', "Coin", location);
    }

    // gives the player points when they are on a coin
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation() && !collected) {
            collected = true;
            gameBoard[getLocation()] = null;
            return InteractionResult.GET_POINT;
        }

        return InteractionResult.NONE;
    }
}
