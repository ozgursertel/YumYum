package com.ozgursertel.YumYum.service;

import com.ozgursertel.YumYum.dtos.DishDTO;
import com.ozgursertel.YumYum.dtos.IngredientDTO;
import com.ozgursertel.YumYum.entity.Dish;
import com.ozgursertel.YumYum.entity.Ingredient;
import com.ozgursertel.YumYum.mapper.DishMapper;
import com.ozgursertel.YumYum.mapper.IngredientMapper;
import com.ozgursertel.YumYum.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;
    @Autowired
    private DishMapper dishMapper;
    @Autowired
    private IngredientMapper ingredientMapper;

    //Get All Dishes
    public List<DishDTO> getAll(){
        return dishMapper.getDishDTOs(dishRepository.findAll());
    }
    //Get Random Dish
    public DishDTO getRandomDish(){
        List<Dish> dishes = dishRepository.findAll();
        Random rng = new Random();
        return dishMapper.dishToDishDto(dishes.get(rng.nextInt(0,dishes.size())),new DishDTO());
    }
    //Get Dish By Name
    public DishDTO getDishByName(String name){
        return dishMapper.dishToDishDto(dishRepository.findByName(name).get(),new DishDTO());
    }

    //Get Dish By Ingredient List
    public List<DishDTO> getDishesByIngredients(List<IngredientDTO> ingredientDTOS){
        List<Ingredient> ingredients = ingredientMapper.getIngredients(ingredientDTOS);
        return dishMapper.getDishDTOs(dishRepository.findAllByIngredients(ingredients));
    }
    //Get Dish By ID
    public DishDTO getDishById(Long id){
        return dishMapper.dishToDishDto(dishRepository.findById(id).get(),new DishDTO());
    }

    //Add Dish
    public DishDTO addDish(DishDTO dishDTO){
        return dishMapper.dishToDishDto(
                dishRepository.save(dishMapper.dishDtoToDish(dishDTO,new Dish())),
                new DishDTO()
        );
    }

    //Update Dish
    public DishDTO updateDish(DishDTO dishDTO,Long id){
        Dish dish = dishRepository.findById(id).get();
        dishMapper.updateDishFromDto(dishDTO,dish);
        return dishMapper.dishToDishDto(
                dishRepository.save(dish),
                new DishDTO());
    }

    //Delete Dish
    public void deleteDish(Long id){
        dishRepository.deleteById(id);
    }
}
