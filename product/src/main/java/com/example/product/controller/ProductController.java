package com.example.product.controller;

import com.example.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/product")
public class ProductController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/hello/{name}")
    public String  getName(@PathVariable ("name") String name){
        return "Hello " + name;
    }
    @GetMapping("/hello/{showId}/{showName}")
    public String setShowId(@PathVariable("showId") int showId , @PathVariable("showName")  String showName){
        return "Hello your showId is this -> " + showId+ "and Your show Name" + showName;
    }
}
