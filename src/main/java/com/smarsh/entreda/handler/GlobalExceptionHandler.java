package com.smarsh.entreda.handler;

import com.smarsh.entreda.constant.AppConstants;
import com.smarsh.entreda.constant.ErrorResponse;
import com.smarsh.entreda.exception.InvalidDataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(
            GlobalExceptionHandler.class);


    @ExceptionHandler(value = { InvalidDataException.class })
    public ResponseEntity<Object> handleInvalidData(InvalidDataException ex, WebRequest request) {
        return new ResponseEntity<>(
                ResponseHandler.builder().status(AppConstants.ERROR)
                        .message(ErrorResponse.BAD_REQUEST.getMessage())
                        .error(fetchErrorMessage(Collections.singletonList(ex.getMessage())))
                        .cyberCode(AppConstants.STATUS_BAD_REQUEST)
                        .data(null).build(), HttpStatus.BAD_REQUEST);
    }
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());

        return new ResponseEntity<>(
                ResponseHandler.builder().status(AppConstants.ERROR)
                        .message(ErrorResponse.BAD_REQUEST.getMessage())
                        .error(fetchErrorMessage(errors))
                        .cyberCode(AppConstants.STATUS_BAD_REQUEST)
                        .data(null).build(), HttpStatus.BAD_REQUEST);

    }

    private List<Error> fetchErrorMessage(List<String> errors) {
        List<Error> errorList = new ArrayList<>();
        for (String errorMessage : errors) {
            Error error = new Error();
            error.setErrorDescription(errorMessage);
            errorList.add(error);
        }
        return errorList;
    }
}

