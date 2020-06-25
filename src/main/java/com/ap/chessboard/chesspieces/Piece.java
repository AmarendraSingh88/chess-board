package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;
import java.util.List;

public abstract class Piece {

   abstract List<String> getPossibleMovements(ChessBoard chessBoard, int x, int y);

   boolean isValidMove(int x, int y) {
      if (x >= 0 && y >= 0 && x < 8 && y < 8){
         return true;
      }
      return false;
   }
}
