/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.controllers;

import com.sg.guessthenumber.servicelayer.InvalidGameException;
import com.sg.guessthenumber.servicelayer.InvalidGuessException;
import java.sql.SQLIntegrityConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author roycerabanal
 */
@ControllerAdvice
@RestController
public class GuessTheNumberExceptionHandler extends ResponseEntityExceptionHandler {
    
    private static final String CONSTRAINT_MESSAGE = "Validity Problem";
    
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public final ResponseEntity<Error> handleSqlException(SQLIntegrityConstraintViolationException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(CONSTRAINT_MESSAGE);
        return new ResponseEntity<>(err, HttpStatus.UNPROCESSABLE_ENTITY);
        
    }
    
    @ExceptionHandler(InvalidGameException.class)
    public final ResponseEntity<Error> handleInvalidGameException(InvalidGameException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(ex.getMessage());
        return new ResponseEntity<>(err, HttpStatus.UNPROCESSABLE_ENTITY);
        
    }
    
    @ExceptionHandler(InvalidGuessException.class)
    public final ResponseEntity<Error> handleInvalidGuessException(InvalidGuessException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(ex.getMessage());
        return new ResponseEntity<>(err, HttpStatus.UNPROCESSABLE_ENTITY);
        
    }
    
}
