package com.ozgursertel.YumYum.entities;

import lombok.*;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "measurement")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "abbreviation")
    private String abbreviation;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "measurement", cascade = CascadeType.ALL)
    private List<FoodIngredient> foodIngredients;


}
