package com.recipePrice.recipePrice.dtos;



import java.util.List;

public record RecipeRequest(List <ProductDTO> productList,
                            Float profit) {



}
