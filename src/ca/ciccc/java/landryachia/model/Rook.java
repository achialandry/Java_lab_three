package ca.ciccc.java.landryachia.model;

/**
 * At the end of the second row, there stands the rook (often, unprofessionally, known as the "castle" or the "tower"). 
 * The rooks represent the castle's walls, which protect the king, queen, bishop, and knights.
 * @author Landry Achia
 *
 */
public class Rook extends ChessPiece{
	
	/**
	 * Static integer value to initialize the Rook piece
	 */
	private static final int ROOK_VALUE = 5;

	/**
	 * Initializing the Rook piece
	 */
	public Rook() {
		super(ROOK_VALUE);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * move method for the Rook pieces which can move horizontally or vertically
	 */
	public void move() {
		System.out.println("horizontally or vertically");
	}

	/* 
	 * Overrides the toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rook [getValue()=" + getValue() + "]";
	}

	
	
}
