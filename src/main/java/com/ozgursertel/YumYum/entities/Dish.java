package com.ozgursertel.YumYum.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dish")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dish_name",nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "recipe")
    private String recipe;
    @Column(name = "estimated_calories")
    private Double estimatedCalories;
    @Column(name = "video_url")
    private String videoUrl;
    @Column(name = "image_url")
    private String imageUrl;
    @ManyToMany(mappedBy = "dishes")
    private List<Ingredient> ingredients;

}
