package com.recipePrice.recipePrice.services;

import com.recipePrice.recipePrice.dtos.ProductResponse;
import com.recipePrice.recipePrice.entities.Product;
import com.recipePrice.recipePrice.dtos.ProductRequest;
import com.recipePrice.recipePrice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse saveProduct(ProductRequest productRequest) {
        Product prod = new Product();
        prod.setName(productRequest.name());
        prod.setUnitOfMeasurement(productRequest.unitOfMeasurement());
        prod.setPrice(productRequest.price());
        Product productSaved = productRepository.save(prod);
        ProductResponse prodResp = new ProductResponse(productSaved.getName(), productSaved.getUnitOfMeasurement(), productSaved.getPrice());
        return prodResp;

    }
}
