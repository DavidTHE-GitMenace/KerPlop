package levelPieces;

import gameEngine.Drawable;

/**
 * I like this comment style ngl
 * Flag class that has a flag that displays on the game board
 */

public class Flag implements Drawable {

    @Override
    public void draw() {
        System.out.print('F');
    }
}
