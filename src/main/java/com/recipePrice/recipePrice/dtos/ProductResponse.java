package com.recipePrice.recipePrice.dtos;

public record ProductResponse(String name,
                              String unitOfMeasurement,
                              Float price )  {

    @Override
    public String toString() {
        return "ProductResponse : " +
                "Name : " + name +",  "+
                "UnitOfMeasurement : " + unitOfMeasurement +",  "+
                "Price: " + price ;
    }
}
