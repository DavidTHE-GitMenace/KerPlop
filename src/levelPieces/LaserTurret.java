package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * A stationary danger that kills a player within two squares.
 * Its beam passes through intervening objects.
 */
public class LaserTurret extends GamePiece {
    private static final int RANGE = 2;

    public LaserTurret(int location) {
        super('L', "Laser turret", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (Math.abs(playerLocation - getLocation()) <= RANGE) {
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }
}
