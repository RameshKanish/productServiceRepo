package com.example.product.exceptions;

public class ProductNotFoundException extends  Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
}
