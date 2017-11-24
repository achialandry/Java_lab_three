package ca.ciccc.java.landryachia.model;

/**
 * The pawns, are the only pieces to stand in the front row and there are more of them than any other pieces on the board. 
 * The pawns represent the serfs, or peasants, who had to pay money to live on the king's land. 
 * They had to work hard, and were still very poor. 
 * Although they aren't really there to "protect," they stand in the front row.
 * 
 * @author Landry Achia
 *
 */

public class Pawn extends ChessPiece {
	
	/**
	 * Static integer value to initialize the Pawn piece
	 */
	private static final int PAWN_VALUE = 1;
	
	/**
	 * Boolean true of false if pawn has been promoted
	 */
	private boolean hasBeenPromoted;
	
	/**
	 * new instance of ChessPiece object
	 */
	private ChessPiece newPiece;

	/**
	 * Initializing the Pawn piece
	 */
	public Pawn() {
		super(PAWN_VALUE);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * method to describe the movement of the pawn objects
	 */
	public void move() {
		System.out.println("forward 1");
	}
	
	
	/**
	 * Creates a new Pawn Piece and verifies if it's not a object of pawn or king and has not been promoted to another piece already 
	 * @param newPiece of the Pawn from of type ChessPiece which is the super class or parent  
	 */
	public void promote(ChessPiece newPiece) {
		if(!(newPiece instanceof Pawn) &&  !(newPiece instanceof King) && (!hasBeenPromoted)) 
		{
			hasBeenPromoted = true;
			this.newPiece = newPiece;
		}
	}

	

	/* 
	 * Overrides the toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pawn [hasBeenPromoted=" + hasBeenPromoted + ", newPiece=" + newPiece + ", getValue()=" + getValue()
				+ "]";
	}

	/* Overrides the hashcode
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasBeenPromoted ? 1231 : 1237);
		result = prime * result + ((newPiece == null) ? 0 : newPiece.hashCode());
		return result;
	}

	/* Overrides the equals()
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pawn other = (Pawn) obj;
		if (hasBeenPromoted != other.hasBeenPromoted)
			return false;
		if (newPiece == null) {
			if (other.newPiece != null)
				return false;
		} else if (!newPiece.equals(other.newPiece))
			return false;
		return true;
	}

	
	

	
}
