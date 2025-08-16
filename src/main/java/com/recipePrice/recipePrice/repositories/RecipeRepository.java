package com.recipePrice.recipePrice.repositories;

import com.recipePrice.recipePrice.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {

}
