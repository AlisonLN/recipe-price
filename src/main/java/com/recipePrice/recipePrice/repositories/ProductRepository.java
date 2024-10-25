package com.recipePrice.recipePrice.repositories;

import com.recipePrice.recipePrice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
