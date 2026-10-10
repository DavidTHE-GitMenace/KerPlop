package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Hurts the player whenever they step on the trap's square
 */
public class SpikeTrap extends GamePiece {
    public SpikeTrap(int location) {
        super('T', "Spike trap", location);
    }

    // interaaction when player steps on trap
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
