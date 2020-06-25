package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    @Override
   public List<String> getPossibleMovements(ChessBoard chessBoard, int x, int y) {
        // Possible move shift for Pawn (Can move only 1 step at a time, in the forward direction, vertically.
        //Can also move 1 step forward diagonally)
        int possibleShiftX[] = { -1, -1, -1};
        int possibleShiftY[] = { -1, 0, 1};

        List<String> possibleMoves = new ArrayList<>();

        for (int i = 0; i < possibleShiftX.length; i++) {

            // possible move positions
            int xP = x + possibleShiftX[i];
            int yP = y + possibleShiftY[i];

            if(isValidMove(xP,yP)){
                possibleMoves.add(chessBoard.getValueAtLocation(xP,yP));
            }
        }
        return possibleMoves;
    }
}