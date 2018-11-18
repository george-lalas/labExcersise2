package com.example.demomssql.service;

import com.example.demomssql.model.Book;
import com.example.demomssql.model.PlanetaryData;
import com.example.demomssql.repository.BookRepository;
import com.example.demomssql.repository.PlanetaryDataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;


@Service
public class DBInit implements ApplicationListener<ApplicationReadyEvent> {
    private static final Logger log = LoggerFactory.getLogger(DBInit.class);


    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PlanetaryDataRepository planetaryDataRepository;

    @Value("classpath:bookData.json")
    private Resource bookResourceFile;

    @Value("classpath:planetaryData.json")
    private Resource planetaryResourceFile;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        log.info("Initializing database with dummy data...");
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Book[] books = objectMapper.readValue(bookResourceFile.getFile(), Book[].class);
            for(Book bk : Arrays.asList(books)){
                bookRepository.save(bk);
            }
            PlanetaryData[] planets = objectMapper.readValue(planetaryResourceFile.getFile(), PlanetaryData[].class);
            for(PlanetaryData pD : Arrays.asList(planets)){
                planetaryDataRepository.save(pD);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        log.info("Init service ended!");
    }
}
