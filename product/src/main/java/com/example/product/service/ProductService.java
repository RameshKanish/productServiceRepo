package com.example.product.service;

import com.example.product.exceptions.ProductNotFoundException;
import com.example.product.models.Product;

public interface ProductService{
    public Product getProductById (long id) throws ProductNotFoundException;
}
