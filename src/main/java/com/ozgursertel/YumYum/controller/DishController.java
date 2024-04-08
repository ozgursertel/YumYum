package com.ozgursertel.YumYum.controller;

import com.ozgursertel.YumYum.dtos.DishDTO;
import com.ozgursertel.YumYum.dtos.IngredientDTO;
import com.ozgursertel.YumYum.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dish")
public class DishController {
    @Autowired
    private DishService dishService;
    //Get All Dishes
    @GetMapping
    public List<DishDTO> getAll(){
        return dishService.getAll();
    }

    //Get Dish By Name
    @GetMapping("/find/name/{name}")
    public DishDTO findDishByName(@PathVariable String name){
        return dishService.getDishByName(name);
    }
    //Get Random Dish
    @GetMapping("/find/random")
    public DishDTO getRandomDish(){
        return dishService.getRandomDish();
    }

    //Get Dish By Ingredient List
    @GetMapping("/find/ingredients")
    public List<DishDTO> getDishesByIngredientList(@RequestBody List<IngredientDTO> ingredientDTOS){
        return dishService.getDishesByIngredients(ingredientDTOS);
    }
    //Get Dish By ID
    @GetMapping("/find/id/{id}")
    public DishDTO findDishById(@PathVariable Long id){
        return dishService.getDishById(id);
    }
    //Add Dish
    @PostMapping("/add")
    public DishDTO addDish(@RequestBody DishDTO dto){
        return dishService.addDish(dto);
    }
    //Update Dish
    @PutMapping("/update/{id}")
    public DishDTO updateDish(@PathVariable Long id,@RequestBody DishDTO dto){
        return dishService.updateDish(dto,id);
    }
    //Delete Dish
    @DeleteMapping("/delete/{id}")
    public void deleteDish(@PathVariable Long id){
        dishService.deleteDish(id);
    }
}
