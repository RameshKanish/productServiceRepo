package com.example.product.controller;

import com.example.product.exceptions.ProductNotFoundException;
import com.example.product.models.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/fakeStore")

public class fakeController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable ("id") int productId) throws ProductNotFoundException{

//        if(productId < 1 || productId > 20){
//            return  new ResponseEntity<>(HttpStatus.valueOf(400));
//        }

        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product , HttpStatusCode.valueOf(200));
    }
    // Exception To Handle the Null Pointer Exception


}