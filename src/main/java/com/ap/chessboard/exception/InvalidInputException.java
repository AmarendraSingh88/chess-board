package com.ap.chessboard.exception;

/**
 * @author amarendra.singh
 */
public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String errorMsg) {
        super(errorMsg);
    }

}
