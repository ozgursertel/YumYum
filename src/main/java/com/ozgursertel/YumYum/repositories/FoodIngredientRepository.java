package com.ozgursertel.YumYum.repositories;

import com.ozgursertel.YumYum.entities.FoodIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodIngredientRepository extends JpaRepository<FoodIngredient,Long> {

}
