package com.nikhil.suitesphere.exceptions;

public class InvalidBookingStateAndDateException extends RuntimeException {
    public InvalidBookingStateAndDateException(String message) {
        super(message);
    }
}

