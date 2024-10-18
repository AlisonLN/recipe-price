package com.recipePrice.recipePrice.repositories;

import com.recipePrice.recipePrice.application.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
