package ca.ciccc.java.landryachia.controller;

import ca.ciccc.java.landryachia.model.*;

public class Driver {

	public static void main(String[] args) {
		Bishop bishopPiece = new Bishop();
		King kingPiece = new King();
		Knight knightPiece = new Knight();
		Pawn pawnPiece = new Pawn();
		Pawn p1 = new Pawn();
		Pawn p2 = new Pawn();
		Queen queenPiece = new Queen();
		Rook rookPiece = new Rook();

		/**
		 * Creating an array of type ChessPiece with all pieces of the Chess game 
		 */
		ChessPiece[] allPieces = { bishopPiece, kingPiece, knightPiece, pawnPiece, queenPiece, rookPiece };
		
		for (ChessPiece eachPiece : allPieces) {
			eachPiece.move();
			System.out.println(eachPiece.equals(bishopPiece));
			
			System.out.println(eachPiece.equals(kingPiece));
			
			System.out.println(eachPiece.equals(knightPiece));
			
			System.out.println(eachPiece.equals(pawnPiece));
			
			System.out.println(eachPiece.equals(queenPiece));
			
			System.out.println(eachPiece.equals(rookPiece));
			
			
		}
		
		pawnPiece.promote(queenPiece);
		System.out.println(pawnPiece.equals(p1));
		
		p1.promote(queenPiece);
		System.out.println(p1.equals(pawnPiece));
		
		p2.promote(knightPiece);
		System.out.println(p2.equals(p1));
	}

}
