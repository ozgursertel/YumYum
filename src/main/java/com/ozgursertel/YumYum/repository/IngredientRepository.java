package com.ozgursertel.YumYum.repository;

import com.ozgursertel.YumYum.entity.Dish;
import com.ozgursertel.YumYum.entity.Ingredient;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient,Long> {
    @Override
    Ingredient save(Ingredient entity);

    @Override
    Optional<Ingredient> findById(Long aLong);

    @Override
    List<Ingredient> findAll();

    Optional<Ingredient> findByName(String s);

}
