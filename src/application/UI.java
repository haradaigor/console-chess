package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] chessPieces){
        for (int row = 0; row < chessPieces.length; row++){
            System.out.print((8-row) + " ");
            for (int column = 0; column < chessPieces.length; column++){
                printPiece(chessPieces[row][column]);
            }
            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }

    public static void printPiece (ChessPiece chessPiece){
        if (chessPiece == null){
            System.out.print("-");
        }
        else{
            System.out.print(chessPiece);
        }

        System.out.print(" ");
    }
}
