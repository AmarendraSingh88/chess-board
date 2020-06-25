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
public class PawnTests {
    private Pawn pawn;
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        pawn = new Pawn();
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovementsForPawn(){
        int pointX = 1;
        int pointY = 6;
        expectedList.add("G8");

        //actual call
        resultList = pawn.getPossibleMovements(chessBoard,pointX,pointY);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}
