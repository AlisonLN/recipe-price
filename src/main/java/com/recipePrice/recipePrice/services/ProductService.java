package com.recipePrice.recipePrice.services;

import com.recipePrice.recipePrice.dtos.ProductResponse;
import com.recipePrice.recipePrice.entities.Product;
import com.recipePrice.recipePrice.dtos.ProductRequest;
import com.recipePrice.recipePrice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("Dados a ser salvo na tabela produto " + prod);
        Product productSaved = productRepository.save(prod);
        System.out.println("Os dados " + productSaved + " foram inseridos na tabela produto ");
        ProductResponse prodResp = new ProductResponse(productSaved.getName(), productSaved.getUnitOfMeasurement(), productSaved.getPrice());
        System.out.println("Retorno para o Cliente " + prodResp);
        return prodResp;

    }

    public List<ProductResponse> getAllProducts() {
        System.out.println("Iniciando Metodo Para Fazer Busca no Banco de Dados");
        List<Product> products  = productRepository.findAll();
        System.out.println("A Busca Foi realizada com Sucesso ");
        List<ProductResponse> getResponse =  products.stream()
        .map(product -> new ProductResponse(product.getName(), product.getUnitOfMeasurement(), product.getPrice())).collect(Collectors.toList());
        System.out.println("A lista  Response foi Criada com Sucesso ");
        return getResponse;

    }

}
