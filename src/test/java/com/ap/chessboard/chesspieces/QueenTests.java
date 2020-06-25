package com.ap.chessboard.chesspieces;

import com.ap.chessboard.ChessBoard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amarendra.singh
 */
public class QueenTests {
    private Queen queen;
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        queen = new Queen();
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovementsForQueen(){
        int pointX = 6;
        int pointY = 3;
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
        resultList = queen.getPossibleMovements(chessBoard,pointX,pointY);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}
