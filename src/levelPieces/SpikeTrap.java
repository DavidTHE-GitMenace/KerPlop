package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Damages the player whenever they step on the trap's square.
 */
public class SpikeTrap extends GamePiece {
    public SpikeTrap(int location) {
        super('T', "Spike trap", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
