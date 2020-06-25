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
        //Approach-1- with same approach as for other piece types
        /*// Possible move shift for Queen (Can move across the board in all 8 directions)
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
    }*/

        //Approach-2 as Queen's possible moves will be equivalent to all the moves of Bishop and Rook
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.addAll(new Bishop().getPossibleMovements(chessBoard, x, y));
        possibleMoves.addAll(new Rook().getPossibleMovements(chessBoard, x, y));
        return possibleMoves;
    }
}