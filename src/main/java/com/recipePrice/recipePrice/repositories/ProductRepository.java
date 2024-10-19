package com.recipePrice.recipePrice.repositories;

import com.recipePrice.recipePrice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
