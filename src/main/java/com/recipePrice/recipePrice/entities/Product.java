package com.recipePrice.recipePrice.entities;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;
  private String unitOfMeasurement;
  private Float price;

  @Override
  public String toString() {
    return "UUID : "
        + id
        + ",  "
        + "Name : "
        + name
        + ",  "
        + "UnitOfMeasurement : "
        + unitOfMeasurement
        + ",  "
        + "Price: "
        + price;
  }
}
