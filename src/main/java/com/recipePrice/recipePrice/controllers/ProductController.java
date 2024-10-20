package com.recipePrice.recipePrice.controllers;


import com.recipePrice.recipePrice.dtos.ProductResponse;
import com.recipePrice.recipePrice.dtos.ProductRequest;
import com.recipePrice.recipePrice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping
    public ResponseEntity<ProductResponse> registerProduct(@RequestBody ProductRequest productRequest) {
        System.out.println("Dados recebido no body de entrada  : " + productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(productRequest));

    }

}
