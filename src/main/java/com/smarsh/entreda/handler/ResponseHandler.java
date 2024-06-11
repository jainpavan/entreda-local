package com.smarsh.entreda.handler;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ResponseHandler {
    private String message;
    private List<Error> error;
    private int cyberCode;
    private String status;
    private Object data;
}

@Data
class Error {
    private String errorDescription;
}

