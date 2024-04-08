package com.ozgursertel.YumYum.controller;

import com.ozgursertel.YumYum.dtos.IngredientDTO;
import com.ozgursertel.YumYum.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/ingredients")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

    //Get All Ingredient
    @GetMapping
    public List<IngredientDTO> getAllIngredients(){
        return ingredientService.findAll();
    }
    //Get Ingredient By ID
    @GetMapping("/{id}")
    public IngredientDTO findIngredientById(@PathVariable Long id){
        return ingredientService.findById(id);
    }
    //Get Ingredient By Name
    @GetMapping("/{name}")
    public IngredientDTO findIngredientByName(@PathVariable String name){
        return ingredientService.findByName(name);
    }
    //Update Ingredient By Id
    @PutMapping("/update/{id}")
    public IngredientDTO updateIngredientById(@PathVariable Long id,@RequestBody IngredientDTO dto){
        return ingredientService.updateById(id,dto);
    }
    //Update Ingredient With Ingredient
    @PutMapping("/update")
    public IngredientDTO updateIngredientById(@RequestBody IngredientDTO dto){
        return ingredientService.updateByBody(dto);
    }
    //Add Ingredient
    @PostMapping("/add")
    public IngredientDTO addIngredient(@RequestBody IngredientDTO dto){
        return ingredientService.add(dto);
    }
    //Delete Ingredient
    @DeleteMapping("/remove/{id}")
    public void deleteIngredient(@PathVariable Long id){
        ingredientService.deleteById(id);
    }
}
