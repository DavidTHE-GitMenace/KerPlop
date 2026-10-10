package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Advances the player when the player reaches this square.
 */
public class Portal extends GamePiece {
    public Portal(int location) {
        super('O', "Portal", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.ADVANCE;
        }
        return InteractionResult.NONE;
    }
}
