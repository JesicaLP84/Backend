package org.example;

public class InvalidLineFormatException extends Exception {
    public InvalidLineFormatException(String  errMessage)
    {
        super(errMessage);
    }
}