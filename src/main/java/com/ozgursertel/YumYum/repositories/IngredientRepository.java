package com.ozgursertel.YumYum.repositories;

import com.ozgursertel.YumYum.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient,Long> {
}
