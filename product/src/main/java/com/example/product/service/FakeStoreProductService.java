package com.example.product.service;

import com.example.product.dtoa.FakeStoreProductDto;
import com.example.product.exceptions.ProductNotFoundException;
import com.example.product.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(long id) throws ProductNotFoundException{
        String url = "https://fakestoreapi.com/products/"+id;

        RestTemplate restTemplate = new RestTemplate();

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(url , FakeStoreProductDto.class);

        // To handle Null Pointer Exception

        if(fakeStoreProductDto == null){
            throw new  ProductNotFoundException("Product Not found for "+id);
        }

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