package ca.ciccc.java.landryachia.model;

/**
 * The queen is also a very important piece in the game. 
 * She can move any way she wants, as many spaces as she wants, which makes her a prominent and favorite piece. 
 * The queen represents herself in the game.
 * @author Landry Achia
 *
 */
public class Queen extends ChessPiece {
	
	/**
	 * Static integer value to initialize the Queen piece
	 */
	private static final int QUEEN_VALUE = 9;

	/**
	 * Initializing the Queen piece
	 */
	public Queen() {
		super(QUEEN_VALUE);
		
	}
	
	/**
	 * She can move any way she wants, as many spaces as she wants, which makes her a prominent and favorite piece.
	 */
	public void move() {
		System.out.println("like a bishop or a rook");
	}

	/* Overrides the toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Queen [getValue()=" + getValue() + "]";
	}
	
	
}
