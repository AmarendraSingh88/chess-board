package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amarendra.singh
 */
public class Queen implements Piece {

    @Override
    public List<String> getPossibleMovements(ChessBoard chessBoard, int x, int y) {
        // Possible move shift for Queen (Can move across the board in all 8 directions)
        int[] possibleShiftX = {-1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7,
                -1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] possibleShiftY = {-1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5, -6, -7,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7};

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