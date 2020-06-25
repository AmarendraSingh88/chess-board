package com.ap.chessboard;

import com.ap.chessboard.chesspieces.enumeration.ChessPiecesEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amarendra.singh
 */
public class ChessBoardAppTests {
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;
    private Coordinate coordinate;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        coordinate = new Coordinate(6,3);
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovesForQueen(){
        expectedList.add("C3");
        expectedList.add("B4");
        expectedList.add("A5");
        expectedList.add("E1");
        expectedList.add("E3");
        expectedList.add("F4");
        expectedList.add("G5");
        expectedList.add("H6");
        expectedList.add("C1");
        expectedList.add("D3");
        expectedList.add("D4");
        expectedList.add("D5");
        expectedList.add("D6");
        expectedList.add("D7");
        expectedList.add("D8");
        expectedList.add("D1");
        expectedList.add("C2");
        expectedList.add("B2");
        expectedList.add("A2");
        expectedList.add("E2");
        expectedList.add("F2");
        expectedList.add("G2");
        expectedList.add("H2");

        //actual call
      resultList = ChessBoardApp.getPossibleMoves(ChessPiecesEnum.QUEEN,chessBoard,coordinate);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }

    @Test
    public void getPossibleMovesForBishop(){
        expectedList.add("C3");
        expectedList.add("B4");
        expectedList.add("A5");
        expectedList.add("E1");
        expectedList.add("E3");
        expectedList.add("F4");
        expectedList.add("G5");
        expectedList.add("H6");
        expectedList.add("C1");

        //actual call
        resultList = ChessBoardApp.getPossibleMoves(ChessPiecesEnum.BISHOP,chessBoard,coordinate);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }

    @Test
    public void getPossibleMovesForHorse(){
        expectedList.add("E4");
        expectedList.add("F3");
        expectedList.add("F1");
        expectedList.add("B1");
        expectedList.add("B3");
        expectedList.add("C4");

        //actual call
        resultList = ChessBoardApp.getPossibleMoves(ChessPiecesEnum.HORSE,chessBoard,coordinate);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }

    @Test
    public void getPossibleMovesForRook(){
        expectedList.add("D3");
        expectedList.add("D4");
        expectedList.add("D5");
        expectedList.add("D6");
        expectedList.add("D7");
        expectedList.add("D8");
        expectedList.add("D1");
        expectedList.add("C2");
        expectedList.add("B2");
        expectedList.add("A2");
        expectedList.add("E2");
        expectedList.add("F2");
        expectedList.add("G2");
        expectedList.add("H2");

        //actual call
        resultList = ChessBoardApp.getPossibleMoves(ChessPiecesEnum.ROOK,chessBoard,coordinate);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }

    @Test
    public void getPossibleMovesForPawn(){
        expectedList.add("D3");

        //actual call
        resultList = ChessBoardApp.getPossibleMoves(ChessPiecesEnum.PAWN,chessBoard,coordinate);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }

    @Test
    public void getPossibleMovesForKing(){
        expectedList.add("D3");
        expectedList.add("E3");
        expectedList.add("E2");
        expectedList.add("E1");
        expectedList.add("D1");
        expectedList.add("C1");
        expectedList.add("C2");
        expectedList.add("C3");

        //actual call
        resultList = ChessBoardApp.getPossibleMoves(ChessPiecesEnum.KING,chessBoard,coordinate);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}
