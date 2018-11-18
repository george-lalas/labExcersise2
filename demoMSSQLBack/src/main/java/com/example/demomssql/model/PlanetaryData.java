package com.example.demomssql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Planetary_Data_tbl")
@NoArgsConstructor
@Data
public class PlanetaryData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String planetName;
    @Column
    private double gravityData;
    @Column
    private int densityData;

}