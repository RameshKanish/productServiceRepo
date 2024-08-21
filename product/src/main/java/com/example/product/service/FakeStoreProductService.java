package com.example.product.service;

import com.example.product.dtoa.FakeStoreProductDto;
import com.example.product.models.Product;
import org.springframework.web.client.RestTemplate;

public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(long id){
        String url = "https://fakestoreapi.com/products/1";
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(url , FakeStoreProductDto.class);
        return convertFakeStoreToProduct(fakeStoreProductDto);
    }
    private  Product convertFakeStoreToProduct(FakeStoreProductDto dto){
        Product product = new Product();
        product.setName(dto.getTitle());
        product.setDescription(dto.getDescription());
        product.setCategory(dto.getCategory());
        return product;
    }
}