package com.example.product.controller;

import com.example.product.models.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/fakeStore")

public class fakeController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable ("id") int productId){

        if(productId < 1 || productId > 20){
            return  new ResponseEntity<>(HttpStatus.valueOf(400));
        }
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product , HttpStatusCode.valueOf(200));
    }
}