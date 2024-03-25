package com.ozgursertel.YumYum.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "food-ingredient")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "dish_id", nullable = false)
    private Dish dish;
    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;
    @ManyToOne
    @JoinColumn(name = "measurement_id", nullable = false)
    private Measurement measurement;
    @Column(name = "quantity")
    private Double quantity;
}
