package com.recipePrice.recipePrice.controllers;


import com.recipePrice.recipePrice.dtos.ProductResponse;
import com.recipePrice.recipePrice.dtos.ProductRequest;
import com.recipePrice.recipePrice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProduct() {
    System.out.println("Realizado uma requisição GetAllProducts endpoint(/products)");
    return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProducts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getIdProducts(@PathVariable UUID id) {
        System.out.println("Realizando uma requisao GetIdProducts enpoint(/products/id)");
        return ResponseEntity.status(HttpStatus.OK).body(productService.getIdProducts(id));
    }
    @GetMapping(params = "name")
    public ResponseEntity<ProductResponse> getProductByName (@RequestParam String name) {
        System.out.println("Entrada GetProductByName");
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProductByName(name));
    }


}
