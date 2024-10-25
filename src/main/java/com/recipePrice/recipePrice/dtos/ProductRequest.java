package com.recipePrice.recipePrice.dtos;

import java.util.UUID;

public record ProductRequest(   UUID id,
                                String name,
                                String unitOfMeasurement,
                                Float price) {
    @Override
    public String toString() {
        return "ProductRequest : " +
                "UUID : " + id +",  "+
                "Name : " + name +",  "+
                "UnitOfMeasurement : " + unitOfMeasurement +",  "+
                "Price: " + price ;
    }
}
