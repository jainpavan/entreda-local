package com.smarsh.entreda.exception;

public class InvalidDataException extends RuntimeException {
    static final long serialVersionUID = 1L;

    public InvalidDataException(final String message) {
        super(message);
    }
}
