package com.ap.chessboard;

import com.ap.chessboard.chesspieces.*;
import com.ap.chessboard.chesspieces.enumeration.ChessPiecesEnum;
import com.ap.chessboard.exception.InvalidInputException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author amarendra.singh
 */
public class ChessBoardApp {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Input value");
            String boardInput = input.nextLine();
            String[] pieceTypeAndValue = boardInput.split(" ");

            ChessBoard chessBoard = new ChessBoard(8);
            ChessPiecesEnum pieceType = ChessPiecesEnum.valueOf(pieceTypeAndValue[0].toUpperCase());
            Coordinate cords = chessBoard.getLocationCoordinate(pieceTypeAndValue[1]);
            if(Objects.isNull(cords)){
                throw new InvalidInputException("Value is outside of Chess board");
            }
            chessBoard.printValuesFromList(getPossibleMoves(pieceType, chessBoard, cords));
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new InvalidInputException("Input type is not valid. Please provide input in the format- [PieceType CellValue]");
        }
        catch (IllegalArgumentException e){
            throw new InvalidInputException("Piece type is not supported");
        }
    }

    public static List<String> getPossibleMoves(ChessPiecesEnum pieceType, ChessBoard chessBoard, Coordinate coords) {
        switch (pieceType) {
            case KING:
                return (new King().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
            case PAWN:
                return (new Pawn().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
            case BISHOP:
                return (new Bishop().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
            case HORSE:
                return (new Horse().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
            case ROOK:
                return (new Rook().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
            case QUEEN:
                return (new Queen().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
            default:
                throw new InvalidInputException("Piece type is not supported");
        }
    }
}
