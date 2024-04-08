package com.ozgursertel.YumYum.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "measurement_id" )
    private Measurement measurement;

    @Column(name = "quantity")
    private Double quantity;
}
