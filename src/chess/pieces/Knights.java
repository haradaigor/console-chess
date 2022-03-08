package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knights extends ChessPiece {

    public Knights(Board board, Color color) {
        super(board, color);
    }


    @Override
    public String toString(){
        return "H";
    }
}
