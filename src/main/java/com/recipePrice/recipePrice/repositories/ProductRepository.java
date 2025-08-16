package com.recipePrice.recipePrice.repositories;

import com.recipePrice.recipePrice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
  Optional<Product> findByName(String name);

  List<Product> findAllById(List<Product> products);
}
