package com.recipePrice.recipePrice.controllers;


import com.recipePrice.recipePrice.dtos.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/products")
public class ProductController {


    @PostMapping
    public ResponseEntity registerProduct(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok(productRequest);
    }

}
