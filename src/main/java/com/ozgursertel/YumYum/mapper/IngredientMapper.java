package com.ozgursertel.YumYum.mapper;

import com.ozgursertel.YumYum.dtos.IngredientDTO;
import com.ozgursertel.YumYum.entity.Ingredient;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IngredientMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientFromDto(IngredientDTO dto, @MappingTarget Ingredient entity);

    IngredientDTO ingredientToIngredientDto(Ingredient ingredient, @MappingTarget IngredientDTO ingredientDTO);
    Ingredient ingredientDtoToIngredient(IngredientDTO ingredientDTO, @MappingTarget Ingredient ingredient);

    List<IngredientDTO> getIngredientDTOs(List<Ingredient> ingredients);

    List<Ingredient> getIngredients(List<IngredientDTO> ingredientDTOS);
}
