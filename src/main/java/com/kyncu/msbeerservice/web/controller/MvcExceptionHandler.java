package com.kyncu.msbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException exception) {
        List<String> errorList = new ArrayList<>(exception.getConstraintViolations().size());
        exception.getConstraintViolations().forEach(constraintViolation -> {
            errorList.add(errorList.toString());
        });
        return new ResponseEntity<>(errorList, HttpStatus.BAD_REQUEST);
    }
}
