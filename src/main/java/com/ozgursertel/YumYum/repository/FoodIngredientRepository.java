package com.ozgursertel.YumYum.repository;

import com.ozgursertel.YumYum.entity.FoodIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodIngredientRepository extends JpaRepository<FoodIngredient,Long> {

}
