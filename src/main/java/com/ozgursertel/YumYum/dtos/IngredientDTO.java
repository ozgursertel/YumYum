package com.ozgursertel.YumYum.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ozgursertel.YumYum.entity.Dish;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class IngredientDTO {
    @JsonIgnore
    private long id;

    private String name;

    @JsonIgnore
    private List<DishDTO> dishes;
    public IngredientDTO(String name, List<DishDTO> dishes) {
        this.name = name;
        this.dishes = dishes;
    }
}
