package ca.ciccc.java.landryachia.model;

/**
 * The king is the most important piece in the game. 
 * In Medieval times, the king was always the most important thing in the kingdom (and still is now). 
 * Although he can only move one space at a time, if your king is captured, you lose the game.
 * 
 * @author Landry Achia
 *
 */

public class King extends ChessPiece {

	/**
	 * Static integer value to initialize the King piece
	 */
	private static final int KING_VALUE = 1000;
	
	/**
	 * Initializing the King piece
	 */
	public King() {
		super(KING_VALUE);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * The King can only move one space at a time.
	 */
	public void move() {
		System.out.println("one square");
	}

	/* Overrides the toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "King [getValue()=" + getValue() + "]";
	}


	

}
