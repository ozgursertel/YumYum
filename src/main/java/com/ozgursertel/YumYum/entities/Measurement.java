package com.ozgursertel.YumYum.entities;

import lombok.*;

import javax.persistence.*;

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

}
