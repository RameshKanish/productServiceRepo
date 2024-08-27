package com.example.product.advice;

import com.example.product.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> gegProductNotFoundException(ProductNotFoundException pe){
        return new ResponseEntity(pe.getMessage()  , HttpStatusCode.valueOf(400));
    }
}