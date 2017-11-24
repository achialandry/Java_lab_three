package ca.ciccc.java.landryachia.model;

/**
 * The Bishop in a Chess game is  third-most important piece is the bishop. 
 * The bishop can move diagonally.
 * @author Landry Achia
 *
 */

public class Bishop extends ChessPiece {
	
	/**
	 * Static integer value to initialize the Bishop piece
	 */
	private static final int BISHOP_VALUE = 3;

	/**
	 * Initializing the Bishop piece
	 */
	public Bishop() {
		super(BISHOP_VALUE);
		// TODO Auto-generated constructor stub
	}

	/**
	 * The bishop can move diagonally.
	 */
	public void move() {
		System.out.println("diagonally");
	}

	/* Overrides the toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bishop [getValue()=" + getValue() + "]";
	}

	
	
}
