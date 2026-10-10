package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * This lasert thing kills a player within two squares
 * the beam passes through intervening objects
 */
public class LaserTurret extends GamePiece {
    private static final int RANGE = 2;

    public LaserTurret(int location) {
        super('L', "Laser turret", location);
    }

    // interaction obviously
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (Math.abs(playerLocation - getLocation()) <= RANGE) {
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }
}
