package com.ap.chessboard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author amarendra.singh
 */
public class ChessBoard {
      private final String[][] board = {
              {"A8","B8","C8","D8","E8","F8","G8","H8"},
              {"A7","B7","C7","D7","E7","F7","G7","H7"},
              {"A6","B6","C6","D6","E6","F6","G6","H6"},
              {"A5","B5","C5","D5","E5","F5","G5","H5"},
              {"A4","B4","C4","D4","E4","F4","G4","H4"},
              {"A3","B3","C3","D3","E3","F3","G3","H3"},
              {"A2","B2","C2","D2","E2","F2","G2","H2"},
              {"A1","B1","C1","D1","E1","F1","G1","H1"}
      };

    public ChessBoard(int boardSize){
        initializeChessBoard(boardSize);
    }
    public static Map<String, Coordinate> boardMap = new HashMap<>();
    String[] alphabet = {"A","B","C","D","E","F","G","H"};

    private void initializeChessBoard(int boardSize){
        //Add Chess values in the given matrix based on chess board size (It will support the matrix upto 8 size)
       /* for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                board[j][i]= alphabet[i]+ Math.abs(j-boardSize);
            }
        }*/

        //Add chess value as key and coordinate as values
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                boardMap.put(alphabet[i]+ Math.abs(j-boardSize),new Coordinate(j,i));
            }
        }
    }

    public String getValueAtLocation(int x, int y) {
        return board[x][y];
    }

    public Coordinate getLocationCoordinate(String value) {
        return boardMap.get(value);
    }

    public void printValuesFromList(List<String> boardValueList) {
        System.out.println(boardValueList.stream().collect(Collectors.joining(",")));
    }
}
