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
public class KingTests {
    private King king;
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        king = new King();
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovementsForKing(){
        int pointX = 3;
        int pointY = 2;
        expectedList.add("C6");
        expectedList.add("D6");
        expectedList.add("D5");
        expectedList.add("D4");
        expectedList.add("C4");
        expectedList.add("B4");
        expectedList.add("B5");
        expectedList.add("B6");

        //actual call
        resultList = king.getPossibleMovements(chessBoard,pointX,pointY);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}
