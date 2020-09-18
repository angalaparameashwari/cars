package com.markets.car.demo.ms_exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(GeneralException.class)
    public ResponseEntity<ErrorResponse> handleEntityNotFound(GeneralException ex) {
        ex.printStackTrace();
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMsgCode());
        errorResponse.setHttpCode(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        e.printStackTrace();
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("sorry, Something went wrong");
        errorResponse.setHttpCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
