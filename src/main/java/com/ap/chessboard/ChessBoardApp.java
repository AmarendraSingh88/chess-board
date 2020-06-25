package com.ap.chessboard;

import com.ap.chessboard.chesspieces.*;
import com.ap.chessboard.chesspieces.enumeration.ChessPiecesEnum;
import com.ap.chessboard.exception.InvalidInputException;
import java.util.Objects;
import java.util.Scanner;

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
            printPossibleMoves(pieceType, chessBoard, cords);
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new InvalidInputException("Input type is not valid. Please provide input in the format- [PieceType CellValue]");
        }
        catch (IllegalArgumentException e){
            throw new InvalidInputException("Piece type is not supported");
        }
    }

    public static void printPossibleMoves(ChessPiecesEnum pieceType, ChessBoard chessBoard, Coordinate coords) {
        switch (pieceType) {
            case KING:
                chessBoard.printValuesFromList(new King().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
                break;
            case PAWN:
                chessBoard.printValuesFromList(new Pawn().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
                break;
            case BISHOP:
                chessBoard.printValuesFromList(new Bishop().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
                break;
          /*  case HORSE:
                chessBoard.printValuesFromList(new Horse().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
                break;
            case ROOK:
                chessBoard.printValuesFromList(new Rook().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
                break;
            case QUEEN:
                chessBoard.printValuesFromList(new Queen().getPossibleMovements(chessBoard, coords.getX(), coords.getY()));
                break;*/
            default:
                throw new RuntimeException("Piece type is not supported");
        }
    }
}
