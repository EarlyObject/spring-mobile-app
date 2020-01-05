package com.ardaks.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = -7396585195029321080L;

    public UserServiceException(String message) {
        super(message);
    }
}
