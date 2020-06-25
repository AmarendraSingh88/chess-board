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
public class RookTests {
    private Rook rook;
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        rook = new Rook();
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovementsForRook(){
        int pointX = 7;
        int pointY = 7;
        expectedList.add("H2");
        expectedList.add("H3");
        expectedList.add("H4");
        expectedList.add("H5");
        expectedList.add("H6");
        expectedList.add("H7");
        expectedList.add("H8");
        expectedList.add("G1");
        expectedList.add("F1");
        expectedList.add("E1");
        expectedList.add("D1");
        expectedList.add("C1");
        expectedList.add("B1");
        expectedList.add("A1");

        //actual call
        resultList = rook.getPossibleMovements(chessBoard,pointX,pointY);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}
