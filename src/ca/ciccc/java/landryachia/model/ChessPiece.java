package ca.ciccc.java.landryachia.model;

/**
 * Chess is a board game for two players.
 *  It is played in a square board, made of 64 smaller squares, with eight squares on each side. 
 *  Each player starts with sixteen pieces: eight pawns, two knights, two bishops, two rooks, one queen and one king.
 *  
 *  The whole gameboard, which closely resembles a checkerboard, represents the battlefield upon which the pieces fight on.
 * 
 * @author Landry Achia
 *
 */

public abstract class ChessPiece {
	
	/**
	 * integer value that will be allocated to the different pieces in the game
	 * 
	 */
	private int value;
	
	
	/**
	 * integer value to be given based on Chess piece
	 * @param value that will be allocated based on the piece in the Chess game
	 */
	public ChessPiece(int value) {
		this.value = value;
	}
	
	

	/**
	 * accessor method for the instance variable value which is an int
	 * @return the value 
	 */
	public int getValue() {
		return value;
	}

	/**
	 * mutator method for the instance variable value which is an int
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * abstract method to be inherited by other methods (sub classes that will be implemented based on Chess piece);
	 */
	public void move(){
		
	}



	/* (non-Javadoc)
	 * Override the tostring method
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChessPiece [value=" + value + "]";
	}



	/* (non-Javadoc)
	 * overridde for the hashCode method
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}



	/* (non-Javadoc)
	 * Overrides the equals method
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChessPiece other = (ChessPiece) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
	
	
	
}
