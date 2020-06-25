package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

    @Override
    public List<String> getPossibleMovements(ChessBoard chessBoard, int x, int y) {
        // Possible move shift for King (Can move only 1 step at a time in all 8 directions (horizontal, vertical
        //and diagonal))
        int possibleShiftX[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        int possibleShiftY[] = {0, 1, 1, 1, 0, -1, -1, -1};

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