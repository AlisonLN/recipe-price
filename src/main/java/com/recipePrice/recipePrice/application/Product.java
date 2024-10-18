package com.recipePrice.recipePrice.application;

import com.recipePrice.recipePrice.dtos.ProductRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String unitOfMeasurement;
    private Double price;

    public Product(ProductRequest productRequest) {
        this.name = productRequest.name();
        this.unitOfMeasurement = productRequest.unitOfMeasurement();
        this.price = productRequest.price();
    }
}
