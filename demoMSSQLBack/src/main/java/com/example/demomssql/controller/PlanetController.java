package com.example.demomssql.controller;

import com.example.demomssql.model.PlanetaryData;
import com.example.demomssql.repository.PlanetaryDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PlanetController {

    @Autowired
    private PlanetaryDataRepository planetaryDataRepository;

    @GetMapping(path = "/getPlanets")
    public ResponseEntity<List<PlanetaryData>> getAllPlanetaryData(){
        return ResponseEntity.status(HttpStatus.OK).body(planetaryDataRepository.findAll());
    }
}
