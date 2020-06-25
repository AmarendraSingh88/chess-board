package com.ap.chessboard.exception;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String errorMsg) {
        super(errorMsg);
    }

}
