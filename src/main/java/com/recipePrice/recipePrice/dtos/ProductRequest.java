package com.recipePrice.recipePrice.dtos;

public record ProductRequest(String name,
                             String unitOfMeasurement,
                             Float price) {
    @Override
    public String toString() {
        return "ProductRequest : " +
                "Name : " + name +",  "+
                "UnitOfMeasurement : " + unitOfMeasurement +",  "+
                "Price: " + price ;
    }
}
