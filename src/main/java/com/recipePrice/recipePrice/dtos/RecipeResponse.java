package com.recipePrice.recipePrice.dtos;

import com.recipePrice.recipePrice.entities.Product;

import java.util.List;

public record RecipeResponse(List<Product> productList,
                             Float price,
                             Float profit,
                             Float finalPrice) {

}
