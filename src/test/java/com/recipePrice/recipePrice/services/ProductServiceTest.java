//package com.recipePrice.recipePrice.services;
//
//import com.recipePrice.recipePrice.dtos.ProductRequest;
//import com.recipePrice.recipePrice.repositories.ProductRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.util.UUID;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ProductServiceTest {
//    ProductRepository productRepository = Mockito.mock(ProductRepository.class);
//    ProductService productService = new ProductService(productRepository);
//
//    @Test
//    void saveProduct() {
//        productService.saveProduct(new ProductRequest(UUID.randomUUID(),"Alison","Kg",3.90f));
//    }
//
//    @Test
//    void getAllProducts() {
//    }
//
//    @Test
//    void getIdProducts() {
//    }
//}