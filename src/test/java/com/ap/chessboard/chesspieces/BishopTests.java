package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BishopTests {

    private Bishop bishop;
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        bishop = new Bishop();
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovementsForBishop(){
        int pointX = 2;
        int pointY = 2;
        expectedList.add("B7");
        expectedList.add("A8");
        expectedList.add("D5");
        expectedList.add("E4");
        expectedList.add("F3");
        expectedList.add("G2");
        expectedList.add("H1");
        expectedList.add("D7");
        expectedList.add("E8");
        expectedList.add("B5");
        expectedList.add("A4");

        //actual call
       resultList = bishop.getPossibleMovements(chessBoard,pointX,pointY);

       //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}
