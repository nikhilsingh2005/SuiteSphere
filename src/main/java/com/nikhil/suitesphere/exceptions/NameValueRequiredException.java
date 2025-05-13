package com.nikhil.suitesphere.exceptions;

public class NameValueRequiredException extends RuntimeException {
    public NameValueRequiredException(String message) {
        super(message);
    }
}