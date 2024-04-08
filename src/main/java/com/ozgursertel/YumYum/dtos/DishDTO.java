package com.ozgursertel.YumYum.dtos;

import com.ozgursertel.YumYum.entity.Ingredient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class DishDTO {
    private String name;
    private String description;
    private String recipe;
    private Double estimatedCalories;
    private String videoUrl;
    private String imageUrl;
    private List<IngredientDTO> ingredients;
}
