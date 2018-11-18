package com.example.demomssql.repository;

import com.example.demomssql.model.PlanetaryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetaryDataRepository extends JpaRepository <PlanetaryData,Long>{
}
