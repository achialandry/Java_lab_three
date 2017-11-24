package ca.ciccc.java.landryachia.model;

/**
 * The knight is another self-representing piece. 
 * The knights can move in an L-shape. 
 * The knight piece is actually that of a horse's head, because that's what knights rode.
 *  In Medieval times, knights weren't poor, as you may think. 
 *  On the contrary, only the highly educated and wealthy men could become a knight.
 * @author Landry
 *
 */

public class Knight extends ChessPiece {
	
	/**
	 * Static integer value to initialize the Knight piece
	 */
	private static final int KNIGHT_VALUE = 2;

	/**
	 * Initializing the Knight piece
	 */
	public Knight() {
		super(KNIGHT_VALUE);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * The knights can move in an L-shape .
	 */
	public void move() {
		System.out.println("like an L");
	}

	/* (non-Javadoc)
	 * Overrides the toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Knight [getValue()=" + getValue() + "]";
	}

	
	
}
