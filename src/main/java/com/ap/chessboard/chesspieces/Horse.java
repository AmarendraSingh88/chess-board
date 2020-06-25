package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amarendra.singh
 */
public class Horse implements Piece {

    @Override
    public List<String> getPossibleMovements(ChessBoard chessBoard, int x, int y) {
        // Possible move shift for Horse– Can move across the board only in 2.5 steps (2 vertical steps and 1
        //horizontal step)
        int[] possibleShiftX = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] possibleShiftY = { 1, 2, 2, 1, -1, -2, -2, -1 };

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