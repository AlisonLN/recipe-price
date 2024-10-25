package com.recipePrice.recipePrice.dtos;

import java.util.UUID;

public record ProductResponse(  UUID id,
                                String name,
                                String unitOfMeasurement,
                                Float price )  {

    @Override
    public String toString() {
        return "ProductResponse : "+
                "UUID : " + id +",  "+
                "Name : " + name +",  "+
                "UnitOfMeasurement : " + unitOfMeasurement +",  "+
                "Price: " + price ;
    }
}
