package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * sends the player to the next level
 */
public class Tunnel extends GamePiece {
    public Tunnel(int location) {
        super('O', "Tunnel Opening", location);
    }

    // portal interaction function
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.ADVANCE;
        }
        return InteractionResult.NONE;
    }
}
