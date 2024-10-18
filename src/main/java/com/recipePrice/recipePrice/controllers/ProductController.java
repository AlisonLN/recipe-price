package com.recipePrice.recipePrice.controllers;


import com.recipePrice.recipePrice.application.Product;
import com.recipePrice.recipePrice.dtos.ProductRequest;
import com.recipePrice.recipePrice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody  ProductRequest productRequest) {
        Product newProduct = new Product(productRequest);
        productRepository.save(newProduct);
        return ResponseEntity.ok(newProduct);
    }

}
