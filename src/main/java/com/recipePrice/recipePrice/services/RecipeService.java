package com.recipePrice.recipePrice.services;

import com.recipePrice.recipePrice.dtos.RecipeRequest;
import com.recipePrice.recipePrice.dtos.RecipeResponse;
import com.recipePrice.recipePrice.entities.Product;
import com.recipePrice.recipePrice.repositories.ProductRepository;
import com.recipePrice.recipePrice.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

  private final ProductRepository productRepository;
  private final RecipeRepository recipeRepository;

  public RecipeService(ProductRepository productRepository, RecipeRepository recipeRepository) {
    this.productRepository = productRepository;
    this.recipeRepository = recipeRepository;
  }

  public RecipeResponse createRecipe(RecipeRequest request) {
//    List<Product> productList = productRepository.findAllById(request.productList());


      return null;
  }
}
