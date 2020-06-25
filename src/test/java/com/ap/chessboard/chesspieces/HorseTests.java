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
public class HorseTests {
    private Horse horse;
    private ChessBoard chessBoard;
    List<String> resultList;
    List<String> expectedList;

    @Before
    public void setup(){
        chessBoard = new ChessBoard(8);
        horse = new Horse();
        resultList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    public void getPossibleMovementsForHorse(){
        int pointX = 2;
        int pointY = 3;
        expectedList.add("E8");
        expectedList.add("F7");
        expectedList.add("F5");
        expectedList.add("E4");
        expectedList.add("C4");
        expectedList.add("B5");
        expectedList.add("B7");
        expectedList.add("C8");

        //actual call
        resultList = horse.getPossibleMovements(chessBoard,pointX,pointY);

        //Verification
        Assert.assertEquals(expectedList,resultList);
    }
}