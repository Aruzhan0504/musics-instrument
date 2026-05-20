package org.example.musicsinstrument.exception;

public class EmailUniqueException extends RuntimeException{
    public EmailUniqueException() {
    }

    public EmailUniqueException(String message) {
        super(message);
    }
}
