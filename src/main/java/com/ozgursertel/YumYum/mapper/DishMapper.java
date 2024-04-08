package com.ozgursertel.YumYum.mapper;

import com.ozgursertel.YumYum.dtos.DishDTO;
import com.ozgursertel.YumYum.entity.Dish;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DishMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDishFromDto(DishDTO dto, @MappingTarget Dish entity);
    DishDTO dishToDishDto(Dish dish, @MappingTarget DishDTO dishDTO);
    Dish dishDtoToDish(DishDTO dishDTO, @MappingTarget Dish dish);
    List<DishDTO> getDishDTOs(List<Dish> dishes);
    List<Dish> getDishes(List<DishDTO> dishDTOS);
}
