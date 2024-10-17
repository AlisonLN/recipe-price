package com.recipePrice.recipePrice.dtos;

public record ProductRequest(String name,
                             String unitOfMeasurement,
                             Double price) {
}
