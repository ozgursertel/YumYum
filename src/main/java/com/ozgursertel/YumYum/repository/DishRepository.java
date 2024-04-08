package com.ozgursertel.YumYum.repository;

import com.ozgursertel.YumYum.entity.Dish;
import com.ozgursertel.YumYum.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
    @Override
    Optional<Dish> findById(Long id);

    Dish save(Dish dish);

    @Override
    List<Dish> findAll();

    @Override
    void delete(Dish dish);

    //@Query("SELECT d FROM Dish d WHERE ALL(i MEMBER OF d.ingredients) i IN :ingredients")
    List<Dish> findAllByIngredients(List<Ingredient> ingredients);


    Optional<Dish> findByName(String name);
}
