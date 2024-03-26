package com.ozgursertel.YumYum.repositories;

import com.ozgursertel.YumYum.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {

}
