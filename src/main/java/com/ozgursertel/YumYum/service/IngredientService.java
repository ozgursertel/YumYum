package com.ozgursertel.YumYum.service;

import com.ozgursertel.YumYum.dtos.IngredientDTO;
import com.ozgursertel.YumYum.entity.Ingredient;
import com.ozgursertel.YumYum.mapper.IngredientMapper;
import com.ozgursertel.YumYum.repository.FoodIngredientRepository;
import com.ozgursertel.YumYum.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private FoodIngredientRepository foodIngredientRepository;
    @Autowired
    private IngredientMapper ingredientMapper;
    //Get All Ingredient
    public List<IngredientDTO> findAll(){
        return ingredientMapper.getIngredientDTOs(ingredientRepository.findAll());
    }
    //Get Ingredient By ID
    public IngredientDTO findById(Long id){
        return ingredientMapper.ingredientToIngredientDto(ingredientRepository.findById(id).get(),new IngredientDTO());
    }
    //Get Ingredient By Name
    public IngredientDTO findByName(String name){
        return ingredientMapper.ingredientToIngredientDto(ingredientRepository.findByName(name).get(),new IngredientDTO());
    }
    //Update Ingredient By Id
    public IngredientDTO updateById(Long id,IngredientDTO dto){
        Ingredient i = ingredientRepository.findById(id).get();
        ingredientMapper.updateIngredientFromDto(dto,i);
        return ingredientMapper.ingredientToIngredientDto(ingredientRepository.save(i),new IngredientDTO());
    }
    //Update Ingredient With Ingredient
    public IngredientDTO updateByBody(IngredientDTO dto){
        Ingredient i = ingredientRepository.findById(dto.getId()).get();
        ingredientMapper.updateIngredientFromDto(dto,i);
        return ingredientMapper.ingredientToIngredientDto(ingredientRepository.save(i),new IngredientDTO());
    }
    //Add Ingredient
    public IngredientDTO add(IngredientDTO dto){
        Ingredient ingredient = ingredientMapper.ingredientDtoToIngredient(dto,new Ingredient());
        ingredientRepository.save(ingredient);
        dto = ingredientMapper.ingredientToIngredientDto(ingredient,dto);
        return dto;
    }
    //Delete Ingredient
    public void deleteById(Long id){
        ingredientRepository.deleteById(id);
    }
}
