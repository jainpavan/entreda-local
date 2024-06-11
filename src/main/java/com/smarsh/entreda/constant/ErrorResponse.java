package com.smarsh.entreda.constant;

import lombok.Getter;

@Getter
public enum ErrorResponse {
    BAD_REQUEST ("Bad request"),
    INVALID_HEADER ("Invalid header"),
    INVALID_DEVICE_ID ("Invalid device id"),
    INTERNAL_SERVER_ERROR ("Internal server error");

    public String message;

    private ErrorResponse(String message) {
        this.message = message;
    }
}
